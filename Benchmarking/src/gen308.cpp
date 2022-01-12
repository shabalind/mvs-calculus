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
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s2> p0;
    s2 p1;
    s4(std::vector<s2> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s1 f24(const s1 &v0) {
    const s0 v6 = v0.p0;
    const std::vector<std::vector<double>> v7 = v6.p1;
    s1 v5 = v0;
    v5 = v0;
    const std::vector<std::vector<double>> v11 = v6.p0;
    v5.p1 = v6;
    const s0 v42(v11, v7);
    v5.p1 = v42;
    return v5;
  }
  s2 f17(const s2 &v0) {
    s2 v6 = v0;
    s2 v2 = v6;
    v6 = v2;
    s2 v5 = v0;
    const s1 v4 = v6.p1;
    s1 v1 = v4;
    const s1 v3 = f24(v4);
    const s1 v10 = f24(v4);
    s1 v7 = v10;
    s2 v18 = v2;
    v18.p1 = v4;
    v6.p1 = v1;
    const s1 v11 = v18.p1;
    const s1 v12 = f24(v7);
    const s1 v15 = f24(v3);
    const s1 v14 = v2.p0;
    v2.p0 = v12;
    s1 v16 = v1;
    v6.p1 = v14;
    const s0 v20 = v7.p0;
    const s0 v24 = v16.p0;
    v16.p0 = v24;
    v7.p0 = v20;
    v16 = v11;
    const s1 v50 = f24(v11);
    v16.p1 = v24;
    v1.p0 = v24;
    const s1 v78 = v5.p0;
    const s0 v67 = v50.p1;
    const s2 v58(v50, v78);
    v18.p0 = v4;
    s2 v91 = v58;
    v16.p0 = v67;
    const s0 v81 = v15.p1;
    v16.p1 = v81;
    return v91;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    const s2 v5 = v0.p1;
    const s2 v2 = f17(v5);
    double v7 = v1;
    const s1 v4 = v2.p1;
    const s1 v3 = f24(v4);
    const s0 v25 = v3.p0;
    s0 v53 = v25;
    const std::vector<std::vector<double>> v16 = v53.p1;
    const std::vector<double> v32 = v16[0];
    const std::vector<std::vector<double>> v35 = v53.p1;
    std::vector<double> v68 = v32;
    std::vector<std::vector<double>> v50 = v35;
    v53.p1 = v50;
    v53.p1 = v16;
    v68[0] = v7;
    const double v93 = v68[0];
    return v93;
  }
  int main() {
    s4 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } }, { { { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { 27.0 }, { 28.0 } }, { { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 } } }, { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } } }, { { { { { 36.0 }, { 37.0 } }, { { 38.0 } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } } }, { { { { 42.0 }, { 43.0 } }, { { 44.0 } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 } } } } } });
    double v1(48.0);
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
