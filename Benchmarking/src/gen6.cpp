  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s0 p2;
    s1(std::vector<std::vector<s0>> v0, s0 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  s0 f102(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<std::vector<double>> v8 = v0.p1;
    s0 v15 = v0;
    const std::vector<std::vector<double>> v7 = v15.p1;
    v15.p0 = v6;
    v15.p1 = v4;
    const std::vector<std::vector<double>> v2 = v15.p0;
    v15.p0 = v2;
    const std::vector<std::vector<double>> v12 = v15.p0;
    v15.p0 = v12;
    const std::vector<std::vector<double>> v13 = v0.p1;
    s0 v21 = v0;
    const std::vector<std::vector<double>> v9 = v15.p0;
    v21.p0 = v4;
    const std::vector<double> v18 = v9[0];
    s0 v20 = v15;
    v21.p0 = v6;
    std::vector<std::vector<double>> v33 = v4;
    v33[0] = v18;
    v33[0] = v18;
    v15.p0 = v33;
    v15 = v21;
    const std::vector<std::vector<double>> v32 = v21.p0;
    const std::vector<std::vector<double>> v41 = v21.p0;
    v15.p1 = v8;
    v15.p0 = v41;
    v15.p0 = v7;
    v21.p0 = v8;
    const std::vector<std::vector<double>> v49 = v20.p1;
    const std::vector<double> v104 = v32[0];
    const std::vector<std::vector<double>> v46 = v15.p1;
    v21.p0 = v6;
    v15.p0 = v49;
    s0 v34 = v0;
    const std::vector<std::vector<double>> v95 = v20.p0;
    v21.p0 = v13;
    v34.p1 = v46;
    const std::vector<std::vector<double>> v77 = v15.p0;
    v33[0] = v104;
    v15.p1 = v41;
    v20.p0 = v95;
    v15.p1 = v77;
    return v34;
  }
  s0 f89(const s0 &v0) {
    s0 v2 = v0;
    const s0 v5 = f102(v2);
    return v5;
  }
  s0 f74(const s0 &v0) {
    const s0 v8 = f89(v0);
    const s0 v1 = f102(v8);
    const s0 v5 = f102(v1);
    const s0 v3 = f102(v5);
    const std::vector<std::vector<double>> v10 = v8.p0;
    const s0 v14 = f102(v3);
    s0 v25 = v14;
    v25.p1 = v10;
    const std::vector<std::vector<double>> v36 = v3.p1;
    v25.p1 = v36;
    return v25;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s2 &v1, const double &v2) {
    const s0 v3 = v0.p2;
    const s0 v11 = f74(v3);
    const double v49 = v2 / v2;
    const std::vector<std::vector<double>> v36 = v11.p1;
    double v59 = v49;
    const std::vector<double> v71 = v36[0];
    std::vector<double> v137 = v71;
    v137[0] = v59;
    v137[0] = v2;
    const double v177 = v137[0];
    return v177;
  }
  int main() {
    s1 v0({ { { { { { 0.0 } }, { { 1.0 } } } }, { { { { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 } } } } }, { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } });
    s2 v1({ { { { { { { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 } } } }, { { { { 14.0 } }, { { 15.0 } } } } }, { { { 16.0 } }, { { 17.0 } } }, { { { 18.0 } }, { { 19.0 } } } } });
    double v2(20.0);
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
