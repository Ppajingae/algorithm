# 알고리즘 풀이 (Java / Python)

기존 `src/algorithm/` 날짜별 폴더에 `.java`와 `.py` 파일을 함께 둡니다.
Java는 기존 IntelliJ 프로젝트 설정으로 실행합니다.

## Python 실행

프로젝트 루트에서 Python 3.12로 가상환경을 생성합니다 (최초 1회).

```sh
python3.12 -m venv .venv
```

가상환경의 Python으로 풀이 파일을 직접 실행합니다.

```sh
.venv/bin/python src/algorithm/_26/october/_261019/main.py
```

터미널에서 가상환경을 활성화해서 사용할 수도 있습니다.

```sh
source .venv/bin/activate
python src/algorithm/_26/october/_261019/main.py
deactivate
```

별도 Python 패키지는 필요하지 않으며, `.venv`는 Git에서 제외합니다.
