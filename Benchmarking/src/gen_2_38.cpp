  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    double p0;
    s0 p1;
    s1(double v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s1> p1;
    s4(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s0 f9(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<std::vector<double>> v7 = v0.p0;
    std::vector<std::vector<double>> v1 = v6;
    std::vector<std::vector<double>> v2 = v1;
    s0 v5 = v0;
    const std::vector<double> v4 = v2[1];
    v2[0] = v4;
    const std::vector<std::vector<double>> v12 = v0.p1;
    v5.p1 = v12;
    s0 v8 = v0;
    const std::vector<double> v16 = v12[1];
    s0 v18 = v5;
    const std::vector<std::vector<double>> v17 = v18.p0;
    v1[0] = v16;
    v18.p1 = v6;
    const std::vector<std::vector<double>> v20 = v8.p1;
    v8.p0 = v17;
    v18.p1 = v6;
    v18.p0 = v17;
    v1[1] = v16;
    v8.p0 = v7;
    v8.p1 = v20;
    v8.p1 = v2;
    return v8;
  }
  s0 f2(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<double> v2 = v4[0];
    std::vector<std::vector<double>> v7 = v4;
    const s0 v5 = f9(v0);
    v7[1] = v2;
    const std::vector<std::vector<double>> v32 = v5.p0;
    const s0 v37(v32, v7);
    return v37;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const s0 &v1, const s4 &v2, const s2 &v3, const std::vector<std::vector<s4>> &v4, const double &v5) {
    const s0 v13 = f2(v1);
    const std::vector<std::vector<double>> v33 = v13.p1;
    s2 v54 = v3;
    const s1 v52 = v54.p1;
    const double v72 = v52.p0;
    const std::vector<double> v57 = v33[0];
    const double v37 = v57[0];
    const double v106 = v37 * v72;
    return v106;
  }
  int main() {
    std::vector<s4> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { 3.0, { { { 4.0 } }, { { 5.0 }, { 6.0 } } } }, { 7.0, { { { 8.0 } }, { { 9.0 }, { 10.0 } } } } } }, { { { { 11.0 } }, { { 12.0 }, { 13.0 } } }, { { 14.0, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { 18.0, { { { 19.0 } }, { { 20.0 }, { 21.0 } } } } } } });
    s0 v1({ { { 22.0 } }, { { 23.0 }, { 24.0 } } });
    s4 v2({ { { { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { 28.0, { { { 29.0 } }, { { 30.0 }, { 31.0 } } } }, { 32.0, { { { 33.0 } }, { { 34.0 }, { 35.0 } } } } } });
    s2 v3({ { { { { 36.0 } }, { { 37.0 }, { 38.0 } } }, { { { 39.0 } }, { { 40.0 }, { 41.0 } } } }, { 42.0, { { { 43.0 } }, { { 44.0 }, { 45.0 } } } } });
    std::vector<std::vector<s4>> v4({ { { { { { 46.0 } }, { { 47.0 }, { 48.0 } } }, { { 49.0, { { { 50.0 } }, { { 51.0 }, { 52.0 } } } }, { 53.0, { { { 54.0 } }, { { 55.0 }, { 56.0 } } } } } } } });
    double v5(57.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
