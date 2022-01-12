  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s0 p2;
    s0 p3;
    s1(s0 v0, s0 v1, s0 v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s4 {
    s1 p0;
    s1 p1;
    s4(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s4 f93(const s4 &v0) {
    s4 v3 = v0;
    s4 v1 = v0;
    s4 v9 = v3;
    s4 v4 = v3;
    const s1 v13 = v9.p1;
    s4 v2 = v1;
    s1 v12 = v13;
    s1 v14 = v13;
    const s1 v6 = v2.p0;
    const std::vector<s1> v11 { v6, v6, v14, v6 };
    s1 v8 = v12;
    const s0 v17 = v6.p3;
    const s1 v16 = v4.p1;
    const s1 v10 = v11[3];
    v3.p0 = v16;
    s4 v18 = v4;
    const s1 v25 = v11[0];
    v14.p1 = v17;
    const s1 v36 = v11[0];
    v8.p1 = v17;
    v4.p1 = v8;
    v18.p1 = v25;
    v2.p1 = v10;
    v1.p0 = v36;
    return v18;
  }
  s1 f89(const s1 &v0) {
    const s0 v4 = v0.p3;
    s1 v1 = v0;
    v1.p2 = v4;
    v1.p2 = v4;
    s1 v2 = v1;
    return v2;
  }
  s1 f82(const s1 &v0) {
    const s1 v5 = f89(v0);
    s1 v25 = v5;
    return v25;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    const s4 v7 = f93(v0);
    s4 v6 = v0;
    const s1 v3 = v6.p0;
    v6 = v7;
    s4 v2 = v7;
    const s0 v5 = v3.p1;
    const s0 v15 = v3.p3;
    v2.p0 = v3;
    s4 v12 = v7;
    const s0 v10 = v3.p0;
    s1 v13 = v3;
    v6.p1 = v13;
    s0 v24 = v10;
    const std::vector<std::vector<double>> v17 = v24.p2;
    double v20 = v1;
    const std::vector<std::vector<double>> v18 = v10.p2;
    v24.p2 = v18;
    const s1 v14 = v2.p0;
    const std::vector<std::vector<double>> v32 = v15.p0;
    const s1 v25 = f89(v14);
    const std::vector<double> v34 = v32[0];
    s0 v29 = v5;
    v13.p1 = v29;
    std::vector<double> v31 = v34;
    const double v30 = v1 + v20;
    const s1 v53 = v12.p0;
    v31[0] = v30;
    const s1 v119 = f82(v13);
    s1 v44 = v119;
    const double v70 = v31[0];
    v12.p0 = v44;
    v13.p3 = v24;
    v24.p2 = v17;
    v6.p0 = v25;
    v6.p0 = v53;
    v2.p1 = v53;
    return v70;
  }
  int main() {
    s4 v0({ { { { { 0.0 } }, { { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 } }, { { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 } }, { { 30.0 }, { 31.0 } } } } });
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
