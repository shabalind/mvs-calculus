  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    s0(double v0): p0(v0) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s7(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s7 p0;
    s7 p1;
    s1 p2;
    std::vector<std::vector<s2>> p3;
    s8(s7 v0, s7 v1, s1 v2, std::vector<std::vector<s2>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s9 {
    std::vector<s0> p0;
    std::vector<s8> p1;
    s9(std::vector<s0> v0, std::vector<s8> v1): p0(v0), p1(v1) { }
  };
  double f8(const double &v0) {
    double v3 = v0;
    double v4 = v0;
    double v5 = v0;
    double v1 = v3;
    double v7 = v4;
    v3 = v5;
    double v6 = v7;
    const s0 v2(v5);
    double v9 = v0;
    double v14 = v7;
    s0 v10 = v2;
    double v18 = v14;
    const double v28 = v10.p0;
    const double v11 = v2.p0;
    v10.p0 = v1;
    v10.p0 = v11;
    v6 = v14;
    v10.p0 = v0;
    const s0 v30(v5);
    double v21 = v1;
    const double v40 = v30.p0;
    v10.p0 = v18;
    v10.p0 = v18;
    const double v25 = v2.p0;
    const std::vector<double> v42 { v6, v28, v21, v9, v40, v14 };
    std::vector<double> v66 = v42;
    const double v55 = v66[3];
    const double v64 = v66[3];
    v14 = v55;
    v4 = v25;
    return v64;
  }
  __attribute__((noinline))
  double f0(const s9 &v0, const double &v1) {
    double v5 = v1;
    v5 = v1;
    const double v9 = f8(v5);
    double v14 = v5;
    double v20 = v14;
    const double v54 = f8(v20);
    const double v37 = f8(v54);
    const double v45 = v37 + v9;
    const double v46 = f8(v45);
    return v46;
  }
  int main() {
    s9 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { { 9.0 } } }, { { 10.0 }, { 11.0 }, { 12.0 } } }, { { { { 13.0 }, { { 14.0 }, { 15.0 }, { 16.0 } } } } } }, { { { { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 } } }, { { { { 23.0 } } }, { { 24.0 }, { 25.0 }, { 26.0 } } }, { { { { 27.0 }, { { 28.0 }, { 29.0 }, { 30.0 } } } } } } } });
    double v1(31.0);
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
