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
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    s2 v5 = v0;
    const s0 v3 = v5.p1;
    v5.p1 = v3;
    double v6 = v1;
    s2 v8 = v5;
    s2 v2 = v0;
    s0 v13 = v3;
    v8.p1 = v3;
    s0 v10 = v3;
    s2 v9 = v5;
    s2 v18 = v9;
    s0 v12 = v10;
    const s1 v11 = v8.p0;
    const std::vector<std::vector<double>> v16 = v10.p1;
    v18.p1 = v10;
    const std::vector<double> v15 = v16[1];
    const double v25 = v15[0];
    v8.p1 = v13;
    const std::vector<double> v24 = v16[1];
    v8.p1 = v13;
    const double v22 = v25 / v1;
    double v19 = v22;
    v5.p1 = v10;
    const double v29 = v1 / v19;
    v8.p0 = v11;
    const std::vector<s1> v23 { v11, v11, v11, v11 };
    const s0 v17 = v11.p1;
    v5.p1 = v13;
    v10 = v17;
    const std::vector<std::vector<double>> v48 = v17.p0;
    const s1 v59(v10, v12);
    v18.p0 = v59;
    v2.p0 = v11;
    const double v33 = v19 / v6;
    double v43 = v29;
    const s1 v51 = v2.p0;
    std::vector<std::vector<double>> v38 = v48;
    const std::vector<double> v30 = v48[2];
    v38[0] = v30;
    v38[1] = v15;
    v38[0] = v24;
    v38[0] = v24;
    std::vector<std::vector<double>> v50 = v48;
    const s1 v67 = v8.p0;
    const std::vector<std::vector<std::vector<double>>> v35 { v38, v50, v48, v48, v48, v50, v50 };
    std::vector<s1> v54 = v23;
    const s1 v95 = v54[2];
    const std::vector<std::vector<double>> v98 = v35[0];
    v43 = v33;
    v8 = v18;
    v5.p0 = v95;
    v8.p1 = v10;
    v12.p0 = v98;
    v54[2] = v67;
    v54[1] = v51;
    return v43;
  }
  int main() {
    s2 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } });
    double v1(15.0);
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
