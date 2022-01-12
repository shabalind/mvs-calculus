  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s1 p1;
    s0 p2;
    s2(std::vector<s1> v0, s1 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  s2 f78(const s2 &v0) {
    s2 v7 = v0;
    s2 v2 = v0;
    s2 v8 = v2;
    s2 v1 = v8;
    const s1 v6 = v7.p1;
    const s0 v9 = v6.p1;
    s1 v3 = v6;
    v3.p0 = v9;
    s0 v5 = v9;
    s0 v4 = v9;
    s0 v11 = v4;
    s1 v25 = v3;
    const s0 v14 = v8.p2;
    v7.p2 = v14;
    const std::vector<double> v10 = v4.p0;
    const double v20 = v10[0];
    const double v12 = v10[1];
    const double v21 = v20 / v20;
    v7.p2 = v11;
    const std::vector<std::vector<double>> v34 = v5.p1;
    std::vector<double> v31 = v10;
    s1 v15 = v3;
    const std::vector<double> v26 = v9.p0;
    const std::vector<double> v19 = v34[0];
    v1.p2 = v5;
    double v27 = v21;
    v5.p0 = v26;
    v31[1] = v21;
    const double v56 = v19[0];
    const std::vector<std::vector<double>> v22 = v9.p1;
    v31[1] = v20;
    v31[1] = v12;
    const double v16 = v19[0];
    v7.p1 = v15;
    const std::vector<double> v36 = v9.p0;
    v27 = v56;
    v31[0] = v12;
    v31[1] = v16;
    s1 v84 = v3;
    const s0 v29 = v25.p0;
    std::vector<double> v30 = v31;
    const s0 v73 = v15.p0;
    v5.p1 = v34;
    const s0 v50(v36, v34);
    v25.p1 = v73;
    const s0 v94 = v15.p1;
    const s0 v74(v30, v22);
    const s0 v63 = v1.p2;
    v5.p1 = v34;
    s0 v127 = v4;
    v4 = v50;
    v8.p2 = v29;
    v3.p0 = v11;
    v3.p0 = v63;
    v15.p0 = v73;
    const std::vector<s1> v117 = v0.p0;
    const s1 v109 = v117[1];
    const s2 v124(v117, v84, v127);
    v15.p0 = v94;
    const s0 v122 = v109.p0;
    const std::vector<std::vector<double>> v79 = v29.p1;
    v84.p0 = v74;
    v11.p1 = v79;
    v31[0] = v27;
    v11 = v122;
    return v124;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    s2 v2 = v0;
    const s2 v6 = f78(v2);
    const s1 v12 = v6.p1;
    s1 v8 = v12;
    const s0 v10 = v8.p1;
    const std::vector<double> v18 = v10.p0;
    v8.p1 = v10;
    v8.p1 = v10;
    const double v66 = v18[0];
    return v66;
  }
  int main() {
    s2 v0({ { { { { 0.0, 1.0 }, { { 2.0 }, { 3.0 } } }, { { 4.0, 5.0 }, { { 6.0 }, { 7.0 } } } }, { { { 8.0, 9.0 }, { { 10.0 }, { 11.0 } } }, { { 12.0, 13.0 }, { { 14.0 }, { 15.0 } } } } }, { { { 16.0, 17.0 }, { { 18.0 }, { 19.0 } } }, { { 20.0, 21.0 }, { { 22.0 }, { 23.0 } } } }, { { 24.0, 25.0 }, { { 26.0 }, { 27.0 } } } });
    double v1(28.0);
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
