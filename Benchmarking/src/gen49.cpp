  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f27(const s0 &v0) {
    s0 v2 = v0;
    v2 = v0;
    const std::vector<std::vector<double>> v4 = v2.p0;
    const std::vector<std::vector<double>> v1 = v2.p1;
    v2 = v0;
    const std::vector<std::vector<double>> v15 = v0.p0;
    v2.p0 = v4;
    v2.p1 = v1;
    const std::vector<std::vector<double>> v13 = v2.p0;
    v2.p1 = v1;
    const std::vector<std::vector<double>> v24 = v2.p1;
    const std::vector<std::vector<double>> v12 = v2.p0;
    v2.p1 = v15;
    const std::vector<std::vector<std::vector<double>>> v34 { v15, v24, v13, v24 };
    s0 v21 = v2;
    const std::vector<std::vector<double>> v20 = v34[0];
    const std::vector<std::vector<double>> v19 = v34[3];
    v21.p0 = v12;
    v2.p0 = v20;
    const std::vector<std::vector<double>> v47 = v21.p1;
    s0 v36 = v21;
    v21.p0 = v13;
    std::vector<std::vector<double>> v61 = v13;
    v21.p1 = v19;
    const std::vector<std::vector<double>> v57 = v21.p0;
    v2.p1 = v1;
    const std::vector<std::vector<double>> v60 = v36.p1;
    const std::vector<std::vector<double>> v89 = v21.p0;
    s0 v84 = v36;
    v2.p1 = v24;
    v84.p0 = v47;
    v2.p0 = v57;
    v2.p1 = v24;
    v21.p0 = v60;
    v84.p0 = v61;
    v36.p0 = v89;
    v21.p1 = v4;
    return v84;
  }
  s0 f26(const s0 &v0) {
    s0 v6 = v0;
    const std::vector<std::vector<double>> v7 = v6.p0;
    const std::vector<std::vector<double>> v13 = v0.p0;
    const std::vector<std::vector<double>> v12 = v6.p1;
    const s0 v21 = f27(v6);
    const s0 v29 = f27(v21);
    const std::vector<std::vector<double>> v35 = v29.p1;
    const s0 v19 = f27(v6);
    v6.p1 = v35;
    s0 v32 = v19;
    v6.p0 = v7;
    v32.p1 = v12;
    v32.p1 = v13;
    return v32;
  }
  s0 f23(const s0 &v0) {
    const s0 v17 = f27(v0);
    const s0 v16 = f27(v17);
    const s0 v29 = f26(v16);
    const s0 v31 = f27(v29);
    return v31;
  }
  s0 f19(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p1;
    s0 v3 = v0;
    std::vector<std::vector<double>> v1 = v2;
    const s0 v7 = f23(v3);
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<double> v5 = v1[1];
    v3.p1 = v2;
    const std::vector<std::vector<double>> v8 = v0.p1;
    const s0 v6 = f23(v3);
    const s0 v9 = f26(v6);
    v1[1] = v5;
    v1[1] = v5;
    const std::vector<double> v10 = v1[1];
    std::vector<double> v13 = v5;
    v3.p0 = v4;
    v1[2] = v10;
    std::vector<std::vector<double>> v14 = v4;
    const s0 v18 = f23(v3);
    const double v11 = v13[0];
    v14[1] = v13;
    std::vector<std::vector<double>> v12 = v14;
    const s0 v16 = f23(v9);
    v3.p0 = v12;
    const s0 v17 = f27(v18);
    const std::vector<std::vector<double>> v25 = v6.p1;
    v12[1] = v13;
    const std::vector<std::vector<double>> v20 = v16.p0;
    const std::vector<std::vector<double>> v46 = v7.p1;
    const s0 v49 = f23(v3);
    const std::vector<double> v42 = v20[1];
    const s0 v35 = f23(v49);
    v12 = v20;
    v13[0] = v11;
    const std::vector<std::vector<double>> v51 = v16.p0;
    const s0 v72 = f27(v49);
    const std::vector<std::vector<double>> v82 = v6.p1;
    v3.p1 = v8;
    v14[2] = v5;
    const std::vector<std::vector<double>> v44 = v17.p1;
    v3.p0 = v2;
    const std::vector<std::vector<double>> v63 = v35.p1;
    v3.p0 = v82;
    s0 v95 = v72;
    const s0 v66 = f23(v95);
    v95.p0 = v44;
    v3.p0 = v25;
    v95.p0 = v63;
    v12[2] = v42;
    const s0 v76 = f27(v66);
    const std::vector<std::vector<double>> v321 = v3.p0;
    const std::vector<std::vector<double>> v137 = v76.p1;
    const std::vector<double> v112 = v1[0];
    v12[0] = v112;
    v3.p0 = v46;
    const s0 v205(v137, v51);
    v3.p0 = v321;
    return v205;
  }
  s0 f15(const s0 &v0) {
    const s0 v3 = f27(v0);
    const s0 v4 = f23(v0);
    const s0 v8 = f23(v3);
    const s0 v11 = f23(v8);
    s0 v15 = v11;
    const std::vector<std::vector<double>> v22 = v4.p0;
    v15.p0 = v22;
    return v15;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    s0 v3 = v0;
    const s0 v5 = f15(v0);
    const s0 v4 = f19(v5);
    const std::vector<std::vector<double>> v14 = v3.p1;
    const std::vector<s0> v9 { v4, v4, v4, v4, v0, v3 };
    const std::vector<double> v8 = v14[0];
    std::vector<std::vector<double>> v15 = v14;
    const s0 v20 = f19(v3);
    std::vector<std::vector<double>> v30 = v15;
    v3.p0 = v15;
    std::vector<s0> v28 = v9;
    const std::vector<double> v38 = v30[2];
    std::vector<double> v33 = v38;
    const s0 v19 = v28[5];
    const std::vector<std::vector<double>> v51 = v19.p1;
    v3.p0 = v51;
    v30[0] = v8;
    const double v81 = v33[0];
    v28[5] = v20;
    v3.p1 = v15;
    v3.p0 = v30;
    return v81;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } });
    double v1(6.0);
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
