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
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s0 p2;
    double p3;
    s2(s1 v0, s0 v1, s0 v2, double v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s5 {
    s2 p0;
    s2 p1;
    s5(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s5 &v0, const s2 &v1, const s1 &v2, const s1 &v3, const double &v4) {
    const std::vector<s0> v7 = v3.p0;
    const s0 v12 = v7[0];
    const s0 v14 = v7[0];
    s0 v11 = v12;
    std::vector<s0> v23 = v7;
    const std::vector<std::vector<double>> v10 = v11.p0;
    const s0 v18 = v7[0];
    const s0 v13 = v7[0];
    const std::vector<std::vector<double>> v9 = v13.p0;
    v23[0] = v13;
    v23[0] = v12;
    v11 = v14;
    const s0 v19 = v7[0];
    const s0 v39 = v7[0];
    const s0 v64 = v23[0];
    v23[0] = v18;
    const s0 v68 = v7[0];
    v11.p0 = v10;
    v23[0] = v19;
    const std::vector<std::vector<std::vector<double>>> v88 { v10, v9 };
    const std::vector<std::vector<double>> v72 = v88[1];
    std::vector<std::vector<double>> v71 = v10;
    v23[0] = v68;
    const std::vector<double> v120 = v71[0];
    v23[0] = v39;
    const double v107 = v120[0];
    v11 = v64;
    v11.p0 = v72;
    return v107;
  }
  int main() {
    s5 v0({ { { { { { { 0.0 } }, { { 1.0 } } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } }, 8.0 }, { { { { { { 9.0 } }, { { 10.0 } } } }, { { { 11.0 } }, { { 12.0 } } } }, { { { 13.0 } }, { { 14.0 } } }, { { { 15.0 } }, { { 16.0 } } }, 17.0 } });
    s2 v1({ { { { { { 18.0 } }, { { 19.0 } } } }, { { { 20.0 } }, { { 21.0 } } } }, { { { 22.0 } }, { { 23.0 } } }, { { { 24.0 } }, { { 25.0 } } }, 26.0 });
    s1 v2({ { { { { 27.0 } }, { { 28.0 } } } }, { { { 29.0 } }, { { 30.0 } } } });
    s1 v3({ { { { { 31.0 } }, { { 32.0 } } } }, { { { 33.0 } }, { { 34.0 } } } });
    double v4(35.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
