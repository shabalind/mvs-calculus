  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s1 p1;
    s3(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  s3 f84(const s3 &v0) {
    s3 v5 = v0;
    const s1 v4 = v0.p1;
    s1 v8 = v4;
    s3 v7 = v5;
    s3 v3 = v0;
    const s0 v9 = v8.p1;
    v3.p1 = v4;
    const std::vector<std::vector<double>> v11 = v9.p0;
    s1 v10 = v4;
    s0 v14 = v9;
    const s0 v13 = v8.p0;
    const std::vector<std::vector<double>> v21 = v14.p1;
    s3 v12 = v0;
    v10.p1 = v9;
    v8.p0 = v14;
    v3 = v7;
    s3 v19 = v7;
    v14.p0 = v11;
    s1 v24 = v4;
    v8.p1 = v13;
    const std::vector<std::vector<double>> v36 = v9.p0;
    s0 v25 = v9;
    const s1 v17 = v12.p1;
    const s1 v56(v25, v13);
    const s0 v34(v11, v21);
    v25.p0 = v11;
    s3 v64 = v12;
    v64.p1 = v4;
    v10.p0 = v13;
    v5.p1 = v56;
    v14.p0 = v36;
    v25.p1 = v21;
    v7 = v3;
    const std::vector<s0> v85 = v12.p0;
    v19.p1 = v10;
    v3.p0 = v85;
    const std::vector<s0> v118 = v64.p0;
    const s1 v97 = v3.p1;
    v7.p1 = v24;
    v7.p1 = v97;
    const s0 v179 = v17.p0;
    v19 = v0;
    v8.p0 = v25;
    v24.p0 = v34;
    v12.p0 = v118;
    v24.p0 = v179;
    return v19;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s3 v2 = f84(v0);
    const std::vector<s0> v26 = v2.p0;
    const s0 v19 = v26[1];
    const std::vector<std::vector<double>> v50 = v19.p0;
    const std::vector<double> v78 = v50[2];
    const double v112 = v78[0];
    return v112;
  }
  int main() {
    s3 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } } });
    double v1(25.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
