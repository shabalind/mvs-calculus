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
    s1 p0;
    std::vector<s1> p1;
    s2(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s1 f23(const s1 &v0) {
    s1 v3 = v0;
    s1 v6 = v0;
    s1 v4 = v3;
    const s0 v8 = v6.p0;
    s1 v2 = v3;
    v6 = v3;
    const std::vector<std::vector<double>> v1 = v8.p0;
    const s0 v5 = v6.p0;
    v2.p1 = v8;
    v4.p0 = v5;
    const s0 v7 = v4.p1;
    s0 v9 = v7;
    s0 v13 = v9;
    v2.p1 = v9;
    v3.p1 = v8;
    v13.p1 = v1;
    v4.p0 = v8;
    v13.p1 = v1;
    v6.p0 = v13;
    return v2;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s1 v4 = v0.p0;
    const s1 v8 = f23(v4);
    const s0 v17 = v8.p1;
    const std::vector<std::vector<double>> v35 = v17.p1;
    const std::vector<double> v45 = v35[1];
    const double v98 = v45[0];
    return v98;
  }
  int main() {
    s2 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } }, { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } } } });
    double v1(32.0);
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
