  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s2 p1;
    s3(s0 v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<s2> &v1, const double &v2) {
    const s0 v24 = v0.p0;
    const std::vector<std::vector<double>> v19 = v24.p1;
    double v30 = v2;
    const std::vector<double> v42 = v19[0];
    std::vector<std::vector<double>> v47 = v19;
    const std::vector<double> v72 = v47[0];
    std::vector<double> v21 = v72;
    v21[0] = v30;
    v47[0] = v42;
    const std::vector<double> v45 = v19[0];
    v47[0] = v21;
    const double v55 = v72[0];
    const double v78 = v45[0];
    const double v135 = v2 * v55;
    const double v63 = v135 - v78;
    return v63;
  }
  int main() {
    s3 v0({ { { { 0.0 } }, { { 1.0 } } }, { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } } });
    std::vector<s2> v1({ { { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } }, { { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } } }, { { { { 14.0 } }, { { 15.0 } } }, { { { 16.0 } }, { { 17.0 } } } } });
    double v2(18.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
