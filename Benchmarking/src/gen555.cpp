  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f24(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p0;
    const std::vector<std::vector<double>> v4 = v0.p1;
    const s0 v13(v3, v4);
    return v13;
  }
  s0 f22(const s0 &v0) {
    const s0 v1 = f24(v0);
    const s0 v2 = f24(v1);
    const std::vector<std::vector<double>> v3 = v0.p0;
    std::vector<std::vector<double>> v5 = v3;
    const std::vector<double> v6 = v5[1];
    v5[0] = v6;
    const s0 v9 = f24(v2);
    const std::vector<std::vector<double>> v11 = v2.p0;
    v5[2] = v6;
    const s0 v16 = f24(v9);
    const s0 v12 = f24(v0);
    const s0 v8 = f24(v12);
    v5[1] = v6;
    std::vector<double> v19 = v6;
    const s0 v26 = f24(v8);
    s0 v28 = v26;
    v28.p0 = v11;
    v5[2] = v19;
    const std::vector<std::vector<double>> v27 = v16.p0;
    v28.p0 = v5;
    v28.p0 = v27;
    v5[1] = v6;
    v28.p0 = v27;
    const s0 v41 = f24(v28);
    const s0 v43 = f24(v16);
    const std::vector<std::vector<double>> v70 = v43.p1;
    v28.p1 = v70;
    return v41;
  }
  std::vector<std::vector<s0>> f21(const std::vector<std::vector<s0>> &v0) {
    std::vector<std::vector<s0>> v4 = v0;
    const std::vector<std::vector<std::vector<s0>>> v3 { v4, v0, v4, v0, v0, v0, v4 };
    const std::vector<std::vector<s0>> v15 = v3[0];
    return v15;
  }
  s0 f20(const s0 &v0) {
    const s0 v3 = f22(v0);
    s0 v2 = v0;
    s0 v10 = v0;
    s0 v5 = v0;
    const s0 v1 = f22(v0);
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<std::vector<double>> v8 = v3.p1;
    const std::vector<std::vector<double>> v6 = v10.p1;
    const s0 v20 = f22(v10);
    const s0 v11 = f24(v1);
    v10.p1 = v4;
    v5 = v20;
    const s0 v12 = f24(v5);
    const std::vector<std::vector<double>> v19 = v3.p0;
    v5.p1 = v6;
    const s0 v14 = f22(v1);
    const std::vector<std::vector<double>> v24 = v11.p1;
    v5.p1 = v24;
    const s0 v25 = f22(v2);
    v2.p1 = v6;
    v2.p0 = v19;
    const s0 v68 = f24(v12);
    const std::vector<std::vector<double>> v28 = v2.p0;
    const std::vector<std::vector<double>> v48 = v14.p1;
    v2.p1 = v8;
    const std::vector<std::vector<double>> v58 = v10.p0;
    v5.p0 = v28;
    v5 = v25;
    v10.p0 = v28;
    v10.p1 = v48;
    v2.p0 = v58;
    return v68;
  }
  std::vector<s0> f15(const s0 &v0, const std::vector<s0> &v1) {
    return v1;
  }
  s0 f13(const s0 &v0) {
    const s0 v3 = f22(v0);
    const s0 v5 = f22(v0);
    const std::vector<s0> v1 { v3, v0, v3, v3, v3, v3 };
    const s0 v2 = v1[5];
    std::vector<s0> v8 = v1;
    v8 = v1;
    std::vector<s0> v10 = v8;
    const s0 v7 = v1[4];
    std::vector<s0> v13 = v8;
    v10[5] = v7;
    std::vector<s0> v6 = v1;
    v6[4] = v3;
    std::vector<s0> v12 = v1;
    const s0 v16 = v6[5];
    const s0 v26 = v12[2];
    const s0 v9 = v8[5];
    const std::vector<std::vector<double>> v28 = v2.p1;
    s0 v17 = v5;
    v10 = v12;
    std::vector<std::vector<double>> v19 = v28;
    s0 v33 = v16;
    const std::vector<std::vector<double>> v23 = v9.p1;
    const s0 v20 = v13[5];
    const s0 v29 = f22(v26);
    s0 v30 = v16;
    v17.p1 = v19;
    s0 v46 = v30;
    const s0 v48 = v10[3];
    const std::vector<std::vector<double>> v22 = v33.p1;
    v46.p1 = v23;
    v33.p1 = v22;
    const std::vector<s0> v35 { v29, v48, v20, v33 };
    const std::vector<double> v56 = v19[0];
    const std::vector<std::vector<double>> v25 = v46.p0;
    v13[4] = v16;
    v17.p1 = v23;
    v30.p0 = v25;
    std::vector<s0> v50 = v35;
    std::vector<std::vector<double>> v89 = v19;
    v17.p0 = v25;
    v46.p1 = v89;
    std::vector<s0> v102 = v10;
    v89[0] = v56;
    const std::vector<std::vector<double>> v134 = v5.p1;
    const s0 v60 = f20(v3);
    v12[3] = v60;
    const s0 v78 = v102[2];
    v8[4] = v78;
    v10[1] = v17;
    const s0 v85 = f20(v48);
    v17.p1 = v134;
    v50[3] = v2;
    v12[3] = v85;
    const s0 v122 = v50[1];
    return v122;
  }
  std::vector<s0> f6(const std::vector<s0> &v0) {
    std::vector<s0> v4 = v0;
    const s0 v6 = v4[0];
    const s0 v2 = f13(v6);
    const std::vector<std::vector<double>> v5 = v2.p1;
    const s0 v7 = f24(v2);
    s0 v9 = v6;
    s0 v3 = v7;
    v4[0] = v3;
    const s0 v15 = f22(v7);
    const s0 v8 = f13(v15);
    v4[0] = v8;
    const s0 v14 = f20(v7);
    const std::vector<std::vector<double>> v40 = v8.p0;
    v3.p0 = v40;
    const s0 v29 = f13(v6);
    std::vector<s0> v19 = v4;
    const std::vector<std::vector<double>> v24 = v29.p1;
    v9.p1 = v5;
    const s0 v36 = f24(v9);
    const std::vector<std::vector<double>> v39 = v8.p0;
    const s0 v31 = f24(v3);
    v9.p0 = v39;
    const std::vector<std::vector<double>> v21 = v29.p0;
    const std::vector<std::vector<double>> v30 = v15.p1;
    const std::vector<std::vector<double>> v46 = v9.p0;
    const std::vector<s0> v64 = f15(v14, v19);
    v4[0] = v36;
    v4 = v0;
    v3.p1 = v24;
    v4[0] = v31;
    v9.p1 = v30;
    v9.p0 = v46;
    const s0 v69 = f20(v7);
    v9.p0 = v21;
    v4[0] = v69;
    return v64;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<std::vector<s0>> v2 = f21(v0);
    const std::vector<s0> v7 = v2[0];
    const std::vector<s0> v19 = f6(v7);
    const s0 v21 = v19[0];
    const std::vector<std::vector<double>> v23 = v21.p0;
    const std::vector<double> v80 = v23[0];
    const double v215 = v80[0];
    return v215;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } });
    double v1(12.0);
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
