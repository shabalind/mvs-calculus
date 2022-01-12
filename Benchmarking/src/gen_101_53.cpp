  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    s0 p1;
    s3(std::vector<s2> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    s0 p1;
    s4(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s4 p0;
    s3 p1;
    s9(s4 v0, s3 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s9 &v0, const std::vector<s1> &v1, const double &v2) {
    double v13 = v2;
    const s3 v14 = v0.p1;
    const s0 v11 = v14.p1;
    const std::vector<std::vector<double>> v35 = v11.p0;
    const std::vector<double> v50 = v35[0];
    std::vector<double> v51 = v50;
    const double v52 = v51[0];
    const double v62 = v50[0];
    const std::vector<double> v39 { v52, v2, v52, v13, v62, v2, v13 };
    const double v49 = v39[0];
    const double v161 = v50[0];
    v51[0] = v161;
    v51[0] = v49;
    return v49;
  }
  int main() {
    s9 v0({ { { { { { { { { 0.0 } } } } }, { { { { 1.0 } } } } }, { { { { { { 2.0 } } } } }, { { { { 3.0 } } } } } }, { { { 4.0 } } } }, { { { { { { { { { { 5.0 } } } } }, { { { { 6.0 } } } } }, { { { { { { 7.0 } } } } }, { { { { 8.0 } } } } }, { { { { { { 9.0 } } } } }, { { { { 10.0 } } } } } }, { { { 11.0 } } } }, { { { { { { { { 12.0 } } } } }, { { { { 13.0 } } } } }, { { { { { { 14.0 } } } } }, { { { { 15.0 } } } } }, { { { { { { 16.0 } } } } }, { { { { 17.0 } } } } } }, { { { 18.0 } } } }, { { { { { { { { 19.0 } } } } }, { { { { 20.0 } } } } }, { { { { { { 21.0 } } } } }, { { { { 22.0 } } } } }, { { { { { { 23.0 } } } } }, { { { { 24.0 } } } } } }, { { { 25.0 } } } } }, { { { 26.0 } } } } });
    std::vector<s1> v1({ { { { { { { 27.0 } } } } }, { { { { 28.0 } } } } } });
    double v2(29.0);
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
