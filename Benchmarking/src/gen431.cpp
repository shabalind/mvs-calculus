  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f40(const std::vector<s0> &v0) {
    std::vector<s0> v5 = v0;
    std::vector<s0> v2 = v5;
    const s0 v3 = v0[0];
    s0 v8 = v3;
    const std::vector<std::vector<double>> v7 = v8.p0;
    const std::vector<double> v1 = v7[0];
    v2[0] = v3;
    const std::vector<double> v6 = v7[0];
    v5[1] = v8;
    v8.p0 = v7;
    v2[0] = v8;
    v8.p0 = v7;
    v8.p0 = v7;
    std::vector<double> v10 = v1;
    const std::vector<std::vector<double>> v11 = v3.p0;
    const std::vector<std::vector<double>> v14 = v3.p1;
    const std::vector<std::vector<double>> v12 = v8.p0;
    const std::vector<std::vector<std::vector<double>>> v13 { v11, v7, v12, v11, v11, v7 };
    std::vector<double> v20 = v10;
    std::vector<std::vector<double>> v19 = v7;
    v8.p1 = v14;
    const std::vector<double> v27 = v7[0];
    v8.p1 = v14;
    v5[0] = v3;
    std::vector<std::vector<std::vector<double>>> v17 = v13;
    v19 = v12;
    const std::vector<std::vector<double>> v29 = v3.p1;
    v8.p1 = v14;
    const std::vector<std::vector<double>> v21 = v8.p1;
    const std::vector<std::vector<double>> v24 = v3.p0;
    const std::vector<std::vector<double>> v40 = v17[2];
    std::vector<std::vector<double>> v18 = v40;
    v8.p0 = v24;
    v18[0] = v6;
    v8.p0 = v19;
    const s0 v43 = v0[1];
    s0 v28 = v3;
    v28.p1 = v29;
    v18[0] = v20;
    s0 v31 = v43;
    const double v59 = v10[0];
    const std::vector<std::vector<double>> v30 = v8.p1;
    std::vector<std::vector<double>> v50 = v21;
    v31.p0 = v18;
    const std::vector<std::vector<s0>> v39 { v5, v2, v2, v5, v5, v0 };
    const s0 v72 = v0[1];
    v20 = v1;
    v8.p0 = v40;
    std::vector<std::vector<double>> v63 = v30;
    v63[0] = v1;
    const s0 v56 = v5[1];
    const std::vector<std::vector<double>> v70 = v56.p1;
    v10[0] = v59;
    v31.p1 = v14;
    const std::vector<std::vector<double>> v62 = v72.p1;
    const std::vector<std::vector<double>> v58 = v17[1];
    const std::vector<std::vector<double>> v60 = v17[5];
    v8.p1 = v14;
    v31.p0 = v58;
    v18[0] = v27;
    v28.p1 = v70;
    v31.p1 = v63;
    const std::vector<std::vector<double>> v33 = v28.p0;
    const s0 v76(v58, v62);
    const double v68 = v27[0];
    v8.p0 = v60;
    const std::vector<s0> v77 = v39[2];
    const double v69 = v59 * v68;
    v31.p1 = v30;
    const std::vector<std::vector<double>> v122 = v31.p0;
    v20[0] = v69;
    v8.p0 = v122;
    v63 = v50;
    std::vector<s0> v116 = v2;
    v116[1] = v76;
    v8.p0 = v33;
    v116 = v77;
    return v116;
  }
  s0 f37(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    s0 v6 = v0;
    std::vector<std::vector<double>> v5 = v4;
    v6.p1 = v4;
    const std::vector<double> v2 = v5[1];
    v6.p1 = v5;
    v6.p1 = v5;
    const std::vector<std::vector<double>> v3 = v6.p1;
    v5[0] = v2;
    s0 v1 = v6;
    v1.p1 = v3;
    v1 = v0;
    const std::vector<std::vector<double>> v38 = v1.p1;
    v1.p1 = v38;
    v1.p1 = v38;
    s0 v46 = v1;
    v6 = v0;
    return v46;
  }
  s0 f36(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v2 = v1.p0;
    std::vector<std::vector<double>> v5 = v2;
    const s0 v8 = f37(v0);
    const std::vector<double> v9 = v2[0];
    const std::vector<std::vector<double>> v15 = v8.p1;
    v5 = v2;
    std::vector<std::vector<double>> v12 = v15;
    v12[0] = v9;
    const std::vector<double> v33 = v12[0];
    std::vector<std::vector<double>> v13 = v5;
    v5[0] = v33;
    std::vector<std::vector<double>> v28 = v13;
    const s0 v70(v28, v12);
    v12[1] = v33;
    v13[0] = v33;
    const std::vector<double> v65 = v28[0];
    v12[0] = v65;
    return v70;
  }
  s0 f35(const s0 &v0, const s0 &v1) {
    const s0 v5 = f36(v0, v0);
    const s0 v4 = f37(v1);
    const s0 v6 = f36(v0, v5);
    const s0 v2 = f37(v5);
    s0 v7 = v0;
    const std::vector<std::vector<double>> v3 = v2.p0;
    const s0 v13 = f37(v5);
    const std::vector<std::vector<double>> v12 = v4.p0;
    const std::vector<std::vector<double>> v15 = v6.p0;
    v7.p0 = v12;
    const s0 v24 = f37(v7);
    const s0 v22 = f36(v5, v4);
    const std::vector<double> v63 = v12[0];
    std::vector<std::vector<double>> v36 = v3;
    const std::vector<std::vector<double>> v32 = v7.p1;
    v36[0] = v63;
    const std::vector<std::vector<double>> v17 = v5.p1;
    v7.p1 = v17;
    const std::vector<std::vector<double>> v28 = v13.p1;
    v7.p0 = v15;
    const std::vector<double> v87 = v28[0];
    std::vector<std::vector<double>> v90 = v36;
    const std::vector<double> v43 = v17[1];
    const std::vector<std::vector<double>> v102 = v22.p0;
    v7.p0 = v90;
    s0 v85 = v24;
    const std::vector<std::vector<double>> v134 = v13.p0;
    v85.p0 = v102;
    v85.p1 = v32;
    const s0 v137 = f36(v85, v85);
    v7.p0 = v90;
    v90[0] = v87;
    const std::vector<std::vector<double>> v65 = v4.p1;
    v36 = v134;
    v90 = v15;
    v7.p1 = v65;
    v36[0] = v43;
    v7.p0 = v36;
    return v137;
  }
  std::vector<s0> f29(const std::vector<s0> &v0) {
    std::vector<s0> v6 = v0;
    const std::vector<s0> v3 = f40(v6);
    const s0 v1 = v0[1];
    const s0 v4 = f37(v1);
    const s0 v13 = v3[1];
    const std::vector<s0> v10 = f40(v3);
    const std::vector<s0> v25 = f40(v10);
    const s0 v41 = f35(v13, v4);
    const std::vector<s0> v22 = f40(v25);
    v6[1] = v41;
    return v22;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const std::vector<s0> v8 = f29(v0);
    const s0 v11 = v8[1];
    const double v3 = v1 + v1;
    const double v30 = v3 + v1;
    const std::vector<std::vector<double>> v20 = v11.p0;
    std::vector<std::vector<double>> v35 = v20;
    const std::vector<double> v40 = v35[0];
    const double v27 = v40[0];
    std::vector<double> v54 = v40;
    const double v37 = v54[0];
    const double v72 = v3 * v37;
    v54[0] = v30;
    v54[0] = v37;
    double v148 = v27;
    v54[0] = v148;
    return v72;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } });
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
