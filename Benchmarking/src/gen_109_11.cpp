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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s1 p1;
    s2(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    s5(s1 v0): p0(v0) { }
  };
  s2 f81(const s2 &v0, const s2 &v1) {
    return v0;
  }
  s2 f30(const double &v0, const s2 &v1) {
    const s2 v10 = f81(v1, v1);
    const s1 v6 = v1.p1;
    const s5 v5(v6);
    const s1 v14 = v5.p0;
    const s2 v4 = f81(v10, v1);
    s2 v28 = v4;
    v28.p1 = v14;
    const s2 v22 = f81(v28, v4);
    v28.p1 = v14;
    const s2 v85 = f81(v10, v22);
    return v85;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s2 v5 = f30(v1, v0);
    const s1 v7 = v5.p1;
    s1 v8 = v7;
    const std::vector<s0> v36 = v8.p1;
    v8 = v7;
    const s0 v17 = v36[2];
    const s0 v24 = v36[0];
    std::vector<s0> v38 = v36;
    v38[2] = v24;
    const std::vector<std::vector<double>> v67 = v24.p0;
    const double v29 = v1 * v1;
    v8.p1 = v38;
    const s0 v103 = v38[2];
    v38[2] = v17;
    v38[2] = v17;
    const std::vector<double> v52 = v67[1];
    const double v42 = v52[0];
    v38[1] = v17;
    const double v54 = v42 + v29;
    double v115 = v54;
    v38[1] = v103;
    return v115;
  }
  int main() {
    s2 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { 27.0 }, { 28.0 } }, { { 29.0 } } } } } }, { { { { { 30.0 }, { 31.0 } }, { { 32.0 } } }, { { { 33.0 }, { 34.0 } }, { { 35.0 } } } }, { { { { 36.0 }, { 37.0 } }, { { 38.0 } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } }, { { { 42.0 }, { 43.0 } }, { { 44.0 } } } } } });
    double v1(45.0);
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
