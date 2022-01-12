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
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s2(std::vector<std::vector<s0>> v0): p0(v0) { }
  };
  struct s3 {
    s2 p0;
    std::vector<s1> p1;
    s3(s2 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    s3 p1;
    s4(s1 v0, s3 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    const s1 v4 = v0.p0;
    double v2 = v1;
    const s0 v10 = v4.p1;
    const s0 v48 = v4.p1;
    const std::vector<std::vector<double>> v22 = v48.p0;
    const std::vector<std::vector<double>> v16 = v10.p0;
    const std::vector<double> v36 = v16[0];
    const std::vector<double> v47 = v22[0];
    std::vector<double> v54 = v36;
    v54[0] = v2;
    v54 = v47;
    const double v142 = v54[0];
    return v142;
  }
  int main() {
    s4 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } } }, { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } } } });
    double v1(15.0);
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
