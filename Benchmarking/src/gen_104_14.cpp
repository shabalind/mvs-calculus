  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  s0 f55(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p2;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<double>> v15 = v0.p4;
    s0 v8 = v0;
    v8.p2 = v15;
    const std::vector<std::vector<double>> v5 = v8.p0;
    v8.p2 = v5;
    v8.p4 = v4;
    const std::vector<std::vector<double>> v12 = v8.p3;
    const std::vector<std::vector<double>> v21 = v0.p3;
    v8.p1 = v12;
    v8.p2 = v6;
    v8.p2 = v15;
    const std::vector<std::vector<double>> v24 = v8.p3;
    std::vector<std::vector<double>> v25 = v21;
    const std::vector<std::vector<double>> v29 = v8.p4;
    v8.p1 = v25;
    const std::vector<std::vector<double>> v23 = v8.p2;
    const std::vector<std::vector<double>> v38 = v0.p4;
    const s0 v56(v4, v12, v23, v24, v29);
    v8.p2 = v38;
    const std::vector<double> v73 = v5[2];
    v25[0] = v73;
    return v56;
  }
  s0 f52(const s0 &v0, const std::vector<std::vector<s0>> &v1) {
    const std::vector<std::vector<double>> v2 = v0.p2;
    const s0 v3 = f55(v0);
    const s0 v7 = f55(v3);
    s0 v8 = v3;
    const std::vector<std::vector<double>> v16 = v7.p2;
    const s0 v9 = f55(v7);
    v8.p0 = v2;
    std::vector<std::vector<double>> v11 = v2;
    v8.p0 = v16;
    const s0 v30 = f55(v8);
    const std::vector<std::vector<double>> v15 = v30.p3;
    const s0 v18 = f55(v9);
    std::vector<std::vector<double>> v12 = v15;
    const std::vector<std::vector<double>> v17 = v9.p2;
    v8.p4 = v16;
    const std::vector<double> v29 = v16[1];
    const std::vector<std::vector<double>> v19 = v3.p0;
    v8.p1 = v15;
    std::vector<std::vector<double>> v20 = v16;
    const s0 v36 = f55(v18);
    const std::vector<std::vector<double>> v22 = v36.p1;
    const s0 v67 = f55(v18);
    const std::vector<std::vector<double>> v35 = v30.p2;
    v8.p2 = v20;
    std::vector<std::vector<double>> v26 = v12;
    std::vector<std::vector<double>> v40 = v35;
    const s0 v38 = f55(v67);
    v40[1] = v29;
    v40[1] = v29;
    const s0 v41(v19, v22, v40, v26, v17);
    v8.p0 = v20;
    s0 v34 = v41;
    v8 = v38;
    v34.p0 = v2;
    s0 v91 = v34;
    const std::vector<double> v96 = v40[0];
    v11[2] = v96;
    v91.p0 = v11;
    return v91;
  }
  s0 f40(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v3 = v0.p3;
    s0 v5 = v1;
    const s0 v2 = f55(v5);
    v5.p3 = v3;
    const std::vector<std::vector<double>> v7 = v1.p3;
    const std::vector<std::vector<std::vector<double>>> v21 { v3, v7, v3, v7, v3, v7 };
    const std::vector<std::vector<double>> v12 = v5.p1;
    const std::vector<std::vector<double>> v10 = v5.p4;
    const std::vector<std::vector<double>> v14 = v5.p4;
    v5.p3 = v12;
    const s0 v16 = f55(v2);
    const std::vector<std::vector<double>> v24 = v21[2];
    v5.p0 = v14;
    v5.p2 = v10;
    v5 = v16;
    v5.p1 = v24;
    v5.p1 = v7;
    s0 v139 = v16;
    return v139;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<s0> v2 = v0[0];
    const s0 v7 = v2[0];
    const s0 v6 = f52(v7, v0);
    const s0 v13 = f40(v7, v6);
    const std::vector<std::vector<double>> v14 = v13.p2;
    const std::vector<double> v19 = v14[0];
    std::vector<double> v23 = v19;
    const double v54 = v23[0];
    return v54;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } }, { { 8.0 }, { 9.0 }, { 10.0 } } } } });
    double v1(11.0);
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
