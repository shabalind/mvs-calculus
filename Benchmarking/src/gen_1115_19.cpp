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
    std::vector<s1> p0;
    s2(std::vector<s1> v0): p0(v0) { }
  };
  struct s4 {
    std::vector<std::vector<s1>> p0;
    s2 p1;
    s4(std::vector<std::vector<s1>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    double p0;
    std::vector<s4> p1;
    s5(double v0, std::vector<s4> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s0 p0;
    s4 p1;
    s6(s0 v0, s4 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<s5> p0;
    std::vector<s0> p1;
    s8(std::vector<s5> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s6 &v0, const std::vector<s8> &v1, const double &v2) {
    const s8 v3 = v1[0];
    const s4 v5 = v0.p1;
    const s8 v12 = v1[0];
    const s0 v8 = v0.p0;
    const std::vector<s5> v6 = v3.p0;
    s8 v14 = v3;
    v14.p0 = v6;
    v14.p0 = v6;
    const std::vector<s0> v18 = v3.p1;
    std::vector<s8> v20 = v1;
    std::vector<s8> v17 = v1;
    const s8 v16 = v20[0];
    v20[0] = v3;
    const std::vector<s0> v26 = v14.p1;
    const s0 v27 = v26[0];
    v14.p0 = v6;
    const std::vector<std::vector<s1>> v11 = v5.p0;
    s0 v25 = v8;
    v20 = v17;
    v14.p1 = v26;
    v20[0] = v14;
    const std::vector<s1> v41 = v11[0];
    v20 = v1;
    const s0 v39 = v18[2];
    const std::vector<std::vector<double>> v42 = v39.p1;
    const std::vector<s5> v45 = v16.p0;
    const s1 v38 = v41[0];
    const std::vector<std::vector<double>> v50 = v25.p0;
    v17[1] = v16;
    std::vector<std::vector<double>> v71 = v50;
    const std::vector<std::vector<double>> v74 = v25.p1;
    v25.p0 = v50;
    const std::vector<double> v78 = v42[0];
    const std::vector<s0> v65 = v38.p0;
    v17 = v20;
    const std::vector<double> v89 = v71[0];
    v14.p0 = v45;
    const double v69 = v89[0];
    const double v84 = v2 - v69;
    v25.p0 = v74;
    v17[1] = v12;
    const s0 v112 = v65[0];
    const std::vector<std::vector<double>> v106 = v112.p1;
    const std::vector<std::vector<double>> v253 = v27.p0;
    v25.p0 = v253;
    v25.p0 = v106;
    v71[0] = v78;
    return v84;
  }
  int main() {
    s6 v0({ { { { 0.0 } }, { { 1.0 } } }, { { { { { { { { 2.0 } }, { { 3.0 } } } }, { { { 4.0 } }, { { 5.0 } } } } } }, { { { { { { { 6.0 } }, { { 7.0 } } } }, { { { 8.0 } }, { { 9.0 } } } }, { { { { { 10.0 } }, { { 11.0 } } } }, { { { 12.0 } }, { { 13.0 } } } } } } } });
    std::vector<s8> v1({ { { { 14.0, { { { { { { { { { 15.0 } }, { { 16.0 } } } }, { { { 17.0 } }, { { 18.0 } } } } } }, { { { { { { { 19.0 } }, { { 20.0 } } } }, { { { 21.0 } }, { { 22.0 } } } }, { { { { { 23.0 } }, { { 24.0 } } } }, { { { 25.0 } }, { { 26.0 } } } } } } } } } }, { { { { 27.0 } }, { { 28.0 } } }, { { { 29.0 } }, { { 30.0 } } }, { { { 31.0 } }, { { 32.0 } } } } }, { { { 33.0, { { { { { { { { { 34.0 } }, { { 35.0 } } } }, { { { 36.0 } }, { { 37.0 } } } } } }, { { { { { { { 38.0 } }, { { 39.0 } } } }, { { { 40.0 } }, { { 41.0 } } } }, { { { { { 42.0 } }, { { 43.0 } } } }, { { { 44.0 } }, { { 45.0 } } } } } } } } } }, { { { { 46.0 } }, { { 47.0 } } }, { { { 48.0 } }, { { 49.0 } } }, { { { 50.0 } }, { { 51.0 } } } } } });
    double v2(52.0);
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
