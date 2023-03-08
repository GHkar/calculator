## calculator
두 개의 수를 입력 받아 합을 알려주는 계산기 소스코드

## 도커(Docker)
리눅스의 응용 프로그램들을 프로세스 격리 기술들을 사용해 컨테이너로 실행하고 관리하는 오픈 소스 프로젝트
[출처 : 위키백과]
도커의 사용법(네트워크 구성, 볼륨 마운트 등)과 도커파일(DockerFile) 사용법에 대해 익힘
https://www.docker.com/

## 젠킨스(Jenkins)
소프트웨어 개발 시 지속적 통합 서비스를 제공하는 툴
[출처 : 위키백과]
간단한 python 프로그래밍을 통해 젠킨스의 구조(Master-slave)를 이해하고 스크립트 사용법(Pipe-line)에 대해 익힘
https://www.jenkins.io/

## Aim
계산기 코드, 도커, 젠킨스를 기반으로 지속적인 배포 시스템을 구현

>1. 도커를 통해 젠킨스를 설치
>2. 젠킨스 파이프라인을 활용하여 계산기 코드의 단위 테스트 수행
>3. JaCoCo를 사용하여 코드 커버리지 테스트
>4. Checkstyle로 코드 품질 검사
>5. 이미지를 생성 후 도커 허브(Docker Hub)에 업로드
>>https://hub.docker.com/r/dofl0119/hello_world_python
>>https://hub.docker.com/r/dofl0119/calculator
>6. 젠킨스와 Git을 연동하여 수락 테스트
>7. Docker Compose 테스트를 위해 계산기 코드와 Nginx/리버스 프록시(Reverse Proxy) 활용
>8. 구성 관리 도구 Ansible-playbook을 사용하여 계산기 코드와 Nginx/리버스 프록시(Reverse Proxy) 환경을 자동으로 구성




