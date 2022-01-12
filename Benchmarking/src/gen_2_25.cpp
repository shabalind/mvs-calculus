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
    std::vector<std::vector<s1>> p0;
    std::vector<std::vector<s1>> p1;
    s3(std::vector<std::vector<s1>> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  s3 f66(const s3 &v0) {
    return v0;
  }
  s3 f58(const s3 &v0) {
    s3 v3 = v0;
    const s3 v4 = f66(v3);
    const std::vector<std::vector<s1>> v13 = v0.p1;
    v3.p1 = v13;
    s3 v17 = v4;
    const s3 v10 = f66(v17);
    return v10;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s3 v3 = f58(v0);
    const std::vector<std::vector<s1>> v2 = v3.p0;
    const std::vector<s1> v4 = v2[0];
    const s1 v7 = v4[0];
    const s0 v10 = v7.p1;
    const std::vector<std::vector<double>> v21 = v10.p0;
    const std::vector<double> v18 = v21[0];
    const double v67 = v18[0];
    return v67;
  }
  int main() {
    s3 v0({ { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } } }, { { { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } }, { { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } } } }, { { { { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } } }, { { { { { 16.0 } }, { { 17.0 } } }, { { { 18.0 } }, { { 19.0 } } } } } } });
    double v1(20.0);
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
