  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    double p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, double v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f51(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    std::vector<std::vector<double>> v3 = v4;
    const std::vector<double> v7 = v3[1];
    std::vector<std::vector<double>> v9 = v3;
    v3 = v9;
    const std::vector<s0> v14 { v0, v0, v0 };
    const std::vector<std::vector<s0>> v6 { v14, v14, v14, v14, v14, v14 };
    const std::vector<s0> v8 = v6[0];
    const std::vector<std::vector<double>> v10 = v0.p0;
    const s0 v18 = v8[2];
    const double v16 = v18.p2;
    const std::vector<double> v19 = v10[1];
    std::vector<double> v34 = v19;
    const s0 v35(v9, v3, v16);
    v3[1] = v34;
    v9[1] = v7;
    return v35;
  }
  std::vector<s0> f43(const s0 &v0, const std::vector<s0> &v1) {
    s0 v7 = v0;
    const s0 v5 = f51(v7);
    std::vector<s0> v15 = v1;
    v7 = v5;
    s0 v24 = v7;
    std::vector<s0> v17 = v15;
    v17[0] = v24;
    v15[0] = v7;
    return v17;
  }
  double f33(const double &v0, const s0 &v1) {
    const s0 v6 = f51(v1);
    s0 v5 = v6;
    double v2 = v0;
    v5.p2 = v0;
    const double v8 = v1.p2;
    v5.p2 = v2;
    v5.p2 = v8;
    const double v13 = v5.p2;
    v2 = v8;
    return v13;
  }
  s0 f31(const s0 &v0) {
    const s0 v3 = f51(v0);
    s0 v5 = v3;
    const std::vector<std::vector<double>> v10 = v0.p0;
    const std::vector<double> v6 = v10[1];
    const std::vector<std::vector<double>> v4 = v3.p1;
    std::vector<std::vector<double>> v2 = v4;
    v5.p1 = v4;
    const std::vector<std::vector<double>> v7 = v0.p1;
    v5.p1 = v10;
    const std::vector<std::vector<double>> v13 = v5.p1;
    const s0 v8 = f51(v5);
    v5.p0 = v13;
    const std::vector<double> v9 = v13[1];
    const s0 v12 = f51(v8);
    const std::vector<std::vector<double>> v15 = v3.p0;
    const s0 v20 = f51(v3);
    v2[1] = v9;
    const double v18 = v20.p2;
    const double v51 = f33(v18, v12);
    const double v23 = v20.p2;
    v5.p2 = v23;
    const s0 v54 = f51(v8);
    const std::vector<std::vector<double>> v40 = v3.p1;
    v5.p0 = v2;
    std::vector<std::vector<double>> v36 = v7;
    v5.p1 = v15;
    s0 v31 = v54;
    v36[1] = v9;
    v36[1] = v6;
    v31.p0 = v36;
    const std::vector<std::vector<double>> v37 = v31.p0;
    const s0 v97(v36, v37, v51);
    v5.p0 = v40;
    return v97;
  }
  s0 f30(const s0 &v0) {
    const s0 v4 = f51(v0);
    const std::vector<std::vector<double>> v2 = v0.p0;
    const s0 v5 = f51(v4);
    const std::vector<s0> v7 { v5, v5, v0, v0, v4, v5, v5 };
    std::vector<s0> v1 = v7;
    v1[6] = v0;
    const s0 v3 = f51(v5);
    s0 v6 = v5;
    const s0 v9 = f51(v6);
    v1[0] = v5;
    v1[1] = v0;
    const double v22 = v5.p2;
    const double v13 = f33(v22, v9);
    const double v24 = f33(v22, v3);
    const s0 v16 = f31(v3);
    s0 v51 = v3;
    std::vector<s0> v23 = v1;
    const s0 v27 = v23[2];
    v51.p0 = v2;
    std::vector<std::vector<double>> v30 = v2;
    const s0 v39 = v7[5];
    const std::vector<double> v41 = v30[0];
    const double v68 = v41[0];
    const double v28 = f33(v68, v51);
    const double v35 = v39.p2;
    const std::vector<double> v48 { v28, v24, v13, v35, v22, v22, v68 };
    const s0 v38 = f51(v6);
    const double v123 = v48[3];
    const std::vector<std::vector<double>> v43 = v51.p1;
    v30 = v43;
    v23[2] = v9;
    s0 v31 = v0;
    const s0 v65 = f51(v38);
    v6.p2 = v123;
    v23[5] = v16;
    const std::vector<std::vector<double>> v81 = v65.p1;
    v1[0] = v31;
    v31.p0 = v81;
    v6.p1 = v81;
    return v27;
  }
  s0 f26(const s0 &v0) {
    s0 v5 = v0;
    const double v4 = v0.p2;
    v5.p2 = v4;
    v5 = v0;
    const s0 v11 = f51(v5);
    const s0 v16 = f30(v11);
    const s0 v17 = f30(v16);
    return v17;
  }
  std::vector<s0> f19(const std::vector<s0> &v0, const std::vector<s0> &v1, const s0 &v2) {
    std::vector<s0> v10 = v0;
    return v10;
  }
  s1 f17(const s1 &v0) {
    const s0 v5 = v0.p0;
    s0 v3 = v5;
    const std::vector<s0> v1 = v0.p1;
    s1 v6 = v0;
    s1 v2 = v6;
    const s0 v7 = f51(v5);
    const std::vector<s0> v13 = f19(v1, v1, v3);
    const std::vector<s0> v8 = v6.p1;
    v2.p0 = v7;
    v6.p0 = v7;
    const s0 v9 = v1[1];
    v2.p1 = v8;
    const s0 v18 = v1[0];
    const std::vector<std::vector<double>> v11 = v3.p0;
    std::vector<std::vector<double>> v40 = v11;
    const std::vector<std::vector<double>> v12 = v18.p1;
    std::vector<std::vector<double>> v4 = v12;
    const s0 v31 = f26(v9);
    const std::vector<double> v16 = v11[1];
    const std::vector<s0> v28 = f19(v8, v13, v31);
    v6.p1 = v28;
    const std::vector<double> v39 = v4[0];
    const std::vector<s0> v53 = v2.p1;
    v40[0] = v16;
    v40[0] = v39;
    v4[0] = v16;
    v6.p1 = v53;
    const s0 v46 = f31(v7);
    v3.p1 = v40;
    const std::vector<s0> v56 = f43(v46, v28);
    v6.p1 = v56;
    return v2;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v6 = v0.p1;
    const s1 v8 = f17(v0);
    s1 v9 = v8;
    std::vector<s0> v4 = v6;
    const s0 v18 = v6[1];
    const s0 v32 = v9.p0;
    v4[0] = v32;
    const s0 v14 = v4[0];
    const std::vector<std::vector<double>> v19 = v14.p1;
    const std::vector<double> v26 = v19[0];
    v4[0] = v18;
    const double v24 = v26[0];
    v9.p1 = v6;
    return v24;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } }, 4.0 }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 } }, 9.0 }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 } }, 14.0 } } });
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
