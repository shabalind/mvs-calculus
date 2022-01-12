  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s0 p2;
    s1(std::vector<s0> v0, s0 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s1 p2;
    s0 p3;
    s3(s0 v0, s0 v1, s1 v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  double f50(const double &v0) {
    double v6 = v0;
    double v3 = v0;
    double v2 = v6;
    v3 = v0;
    double v1 = v3;
    double v11 = v1;
    const std::vector<double> v23 { v0, v0, v11 };
    const std::vector<std::vector<double>> v21 { v23, v23, v23, v23 };
    std::vector<std::vector<double>> v80 = v21;
    v80[1] = v23;
    const std::vector<double> v60 = v80[2];
    std::vector<double> v39 = v60;
    v39[0] = v2;
    const double v37 = v39[2];
    return v37;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const double v3 = f50(v1);
    const double v21 = v1 + v3;
    const std::vector<double> v47 { v1, v3, v3, v21, v1 };
    const double v59 = v47[4];
    return v59;
  }
  int main() {
    s3 v0({ { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } }, { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } } }, { { { 14.0 } }, { { 15.0 } } } });
    double v1(16.0);
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
