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
    std::vector<s0> p3;
    s1(std::vector<std::vector<s0>> v0, s0 v1, s0 v2, std::vector<s0> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  std::vector<s0> f70(const std::vector<s0> &v0, const std::vector<s0> &v1) {
    const s0 v3 = v0[0];
    s0 v4 = v3;
    const std::vector<std::vector<double>> v2 = v4.p0;
    const std::vector<std::vector<double>> v7 = v3.p1;
    std::vector<std::vector<double>> v9 = v7;
    std::vector<std::vector<double>> v11 = v7;
    const std::vector<double> v5 = v9[2];
    const std::vector<double> v6 = v11[1];
    const std::vector<double> v19 = v2[1];
    v9[2] = v19;
    const std::vector<std::vector<double>> v8 = v3.p0;
    const std::vector<std::vector<double>> v13 = v3.p0;
    v11[2] = v6;
    v4.p1 = v9;
    std::vector<s0> v14 = v0;
    std::vector<std::vector<double>> v21 = v11;
    std::vector<std::vector<double>> v10 = v21;
    v4.p0 = v2;
    v9[2] = v19;
    s0 v18 = v4;
    const std::vector<std::vector<double>> v49 = v3.p1;
    v21[0] = v6;
    const std::vector<double> v20 = v8[1];
    v14[0] = v18;
    const std::vector<std::vector<double>> v34 = v3.p1;
    const std::vector<std::vector<double>> v30 = v3.p1;
    s0 v24 = v18;
    v21 = v10;
    const std::vector<std::vector<double>> v43 = v4.p0;
    const std::vector<double> v26 = v13[1];
    const std::vector<double> v80 = v30[1];
    v9[2] = v80;
    v24.p1 = v21;
    const std::vector<double> v38 = v34[0];
    const std::vector<std::vector<double>> v36 = v3.p1;
    v10[0] = v38;
    const std::vector<std::vector<double>> v46 = v18.p0;
    const std::vector<double> v90 = v43[0];
    v24.p0 = v43;
    v14[0] = v24;
    const std::vector<std::vector<double>> v73 = v18.p1;
    v14[0] = v18;
    const s0 v50(v8, v73);
    v11[1] = v20;
    std::vector<s0> v63 = v14;
    const std::vector<std::vector<double>> v54 = v50.p1;
    std::vector<std::vector<double>> v103 = v46;
    v18.p0 = v103;
    v9[2] = v26;
    v4.p1 = v49;
    v18.p1 = v9;
    v21[2] = v90;
    v24.p1 = v54;
    v14 = v0;
    v24.p1 = v36;
    v24.p1 = v7;
    v21[0] = v5;
    return v63;
  }
  std::vector<s0> f22(const std::vector<s0> &v0) {
    const std::vector<s0> v1 = f70(v0, v0);
    const std::vector<s0> v7 = f70(v1, v0);
    return v7;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    std::vector<std::vector<s0>> v2 = v0;
    const std::vector<s0> v3 = v2[2];
    std::vector<s0> v5 = v3;
    v2[0] = v3;
    const std::vector<s0> v7 = f70(v3, v5);
    std::vector<std::vector<s0>> v9 = v0;
    v2[1] = v7;
    const std::vector<s0> v13 = v2[0];
    v2[2] = v5;
    const s0 v10 = v13[0];
    const s1 v17(v9, v10, v10, v13);
    v9[2] = v3;
    const s0 v16 = v17.p2;
    const std::vector<s0> v14 = f22(v3);
    const s1 v23(v9, v16, v10, v13);
    s0 v21 = v16;
    v9[0] = v7;
    const std::vector<s0> v30 = v23.p3;
    const std::vector<std::vector<double>> v19 = v21.p1;
    const std::vector<double> v33 = v19[1];
    v21.p1 = v19;
    v5[0] = v10;
    const s0 v46 = v13[0];
    v2[0] = v3;
    const std::vector<std::vector<double>> v92 = v21.p1;
    const std::vector<s0> v41 = f22(v14);
    v9[0] = v30;
    v21.p1 = v92;
    v2[2] = v3;
    v9[0] = v41;
    v21 = v46;
    const double v96 = v33[0];
    return v96;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } });
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
