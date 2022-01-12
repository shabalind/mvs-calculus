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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f18(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v4 = v0.p2;
    const std::vector<double> v6 = v4[2];
    const std::vector<double> v2 = v4[1];
    s0 v5 = v7;
    v5.p1 = v4;
    v5.p2 = v4;
    v5.p2 = v4;
    s0 v3 = v5;
    const std::vector<double> v8 = v4[1];
    const std::vector<std::vector<double>> v1 = v7.p2;
    std::vector<std::vector<double>> v15 = v1;
    const std::vector<double> v13 = v1[2];
    std::vector<std::vector<double>> v20 = v1;
    const std::vector<std::vector<double>> v9 = v0.p1;
    std::vector<std::vector<double>> v12 = v9;
    std::vector<std::vector<double>> v11 = v12;
    std::vector<double> v17 = v13;
    const std::vector<std::vector<double>> v14 = v0.p2;
    const std::vector<std::vector<double>> v28 = v3.p2;
    v15[0] = v13;
    std::vector<std::vector<double>> v21 = v1;
    const std::vector<std::vector<double>> v18 = v3.p2;
    v21[2] = v2;
    v21[1] = v6;
    v21[0] = v6;
    const std::vector<std::vector<double>> v36 = v7.p0;
    v20 = v11;
    v5.p2 = v9;
    v11[0] = v6;
    v5.p2 = v11;
    const std::vector<std::vector<double>> v19 = v7.p0;
    std::vector<std::vector<double>> v25 = v19;
    std::vector<std::vector<double>> v26 = v25;
    v7.p1 = v15;
    const std::vector<std::vector<double>> v50 = v7.p0;
    v7.p0 = v50;
    v3.p1 = v14;
    const s0 v41(v26, v28, v21);
    v15[2] = v17;
    v3.p0 = v26;
    v7.p0 = v36;
    std::vector<double> v38 = v2;
    v25[0] = v13;
    v26[0] = v8;
    v5.p2 = v18;
    const std::vector<std::vector<double>> v61 = v5.p0;
    const double v120 = v6[0];
    std::vector<double> v93 = v38;
    const std::vector<double> v47 = v20[0];
    const double v46 = v47[0];
    const std::vector<std::vector<double>> v49 = v3.p2;
    v3.p0 = v61;
    v26[1] = v93;
    v3.p0 = v50;
    const std::vector<std::vector<double>> v69 = v41.p0;
    s0 v62 = v41;
    v38[0] = v120;
    v38[0] = v46;
    s0 v65 = v62;
    v5.p2 = v12;
    v62.p1 = v49;
    v65.p0 = v69;
    return v65;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    s1 v6 = v0;
    s1 v4 = v6;
    const s0 v2 = v4.p0;
    const s0 v5 = f18(v2);
    const std::vector<std::vector<double>> v8 = v5.p0;
    const std::vector<double> v9 = v8[0];
    const double v15 = v9[0];
    const double v27 = v9[0];
    const std::vector<s0> v22 = v6.p1;
    const double v28 = v1 + v15;
    std::vector<double> v59 = v9;
    const s0 v41 = v22[0];
    v59[0] = v27;
    const std::vector<std::vector<double>> v123 = v5.p1;
    const std::vector<double> v54 = v123[2];
    const double v52 = v54[0];
    v4.p1 = v22;
    v59[0] = v52;
    std::vector<s0> v39 = v22;
    v59[0] = v1;
    const double v61 = v59[0];
    v59[0] = v27;
    const double v45 = v61 / v28;
    const s0 v135 = v39[1];
    v59[0] = v27;
    v6.p0 = v41;
    v4.p0 = v135;
    return v45;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } } });
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
