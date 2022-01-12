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
  s1 f123(const s1 &v0) {
    const std::vector<s1> v8 { v0, v0, v0, v0, v0, v0, v0 };
    const s1 v6 = v8[5];
    const s1 v2 = v8[1];
    std::vector<s1> v24 = v8;
    v24[5] = v2;
    const s1 v14 = v24[0];
    v24[3] = v6;
    return v14;
  }
  s1 f114(const s1 &v0, const s1 &v1) {
    s1 v6 = v1;
    const s1 v4 = f123(v6);
    const s0 v3 = v4.p0;
    v6.p1 = v3;
    v6.p1 = v3;
    s1 v58 = v4;
    s1 v123 = v58;
    const s1 v141 = f123(v123);
    return v141;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s1 v6 = f114(v0, v0);
    const s0 v4 = v6.p1;
    const std::vector<std::vector<double>> v13 = v4.p0;
    const std::vector<double> v30 = v13[0];
    const double v75 = v30[0];
    return v75;
  }
  int main() {
    s1 v0({ { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } });
    double v1(4.0);
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
