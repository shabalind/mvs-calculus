  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f21(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v1 = v0;
    std::vector<std::vector<double>> v13 = v1;
    return v13;
  }
  std::vector<std::vector<double>> f12(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2) {
    std::vector<std::vector<double>> v7 = v2;
    const std::vector<std::vector<double>> v3 = f21(v0);
    std::vector<std::vector<double>> v9 = v2;
    const std::vector<double> v8 = v2[2];
    v9[0] = v8;
    const double v6 = v8[0];
    v9[0] = v8;
    const std::vector<double> v4 = v3[2];
    const std::vector<double> v28 = v0[0];
    v9[0] = v8;
    const double v12 = v8[0];
    const std::vector<std::vector<double>> v16 = f21(v7);
    const std::vector<double> v18 = v16[0];
    v7[1] = v28;
    v9[0] = v18;
    v9[1] = v4;
    v7[1] = v18;
    std::vector<std::vector<double>> v36 = v9;
    const std::vector<double> v30 = v0[0];
    const std::vector<std::vector<double>> v15 = f21(v36);
    const std::vector<std::vector<double>> v23 = f21(v2);
    const std::vector<double> v34 = v16[1];
    v36[1] = v34;
    const std::vector<double> v78 = v23[1];
    std::vector<double> v54 = v34;
    const std::vector<double> v87 = v3[0];
    const std::vector<double> v67 = v0[1];
    v7[1] = v67;
    v9[0] = v54;
    v54[0] = v12;
    v36[1] = v78;
    v9[1] = v30;
    std::vector<double> v91 = v87;
    v54[0] = v6;
    v54 = v91;
    return v15;
  }
  std::vector<std::vector<double>> f4(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v3 = v0;
    const std::vector<double> v1 = v0[0];
    const std::vector<double> v5 = v0[1];
    const std::vector<std::vector<double>> v7 = f12(v3, v0, v3);
    v3[2] = v1;
    const std::vector<std::vector<double>> v13 = f12(v3, v0, v7);
    std::vector<std::vector<double>> v4 = v0;
    const std::vector<std::vector<double>> v8 = f12(v13, v0, v0);
    const std::vector<std::vector<double>> v2 = f12(v0, v8, v13);
    std::vector<std::vector<double>> v9 = v4;
    const std::vector<double> v21 = v13[1];
    v3[2] = v21;
    v9[2] = v21;
    const std::vector<std::vector<double>> v15 = f21(v4);
    v9[1] = v21;
    const std::vector<std::vector<double>> v20 = f21(v8);
    const double v33 = v1[0];
    std::vector<std::vector<double>> v28 = v15;
    const std::vector<std::vector<double>> v35 = f21(v15);
    std::vector<std::vector<double>> v12 = v28;
    const std::vector<std::vector<double>> v37 = f12(v9, v0, v7);
    v3[0] = v5;
    std::vector<std::vector<double>> v25 = v9;
    v28 = v8;
    const std::vector<std::vector<double>> v43 = f21(v9);
    const std::vector<std::vector<double>> v32 = f21(v25);
    const std::vector<std::vector<double>> v22 = f12(v43, v37, v20);
    v12[0] = v1;
    const std::vector<std::vector<double>> v52 = f12(v12, v22, v25);
    std::vector<std::vector<double>> v62 = v32;
    const std::vector<double> v60 = v43[0];
    const std::vector<std::vector<double>> v44 = f21(v62);
    const std::vector<double> v55 = v43[2];
    v3 = v52;
    v28[1] = v60;
    double v66 = v33;
    const std::vector<double> v51 = v35[2];
    v28[0] = v5;
    std::vector<double> v48 = v51;
    const std::vector<std::vector<double>> v149 = f21(v2);
    const std::vector<std::vector<double>> v112 = f21(v12);
    v28 = v62;
    double v73 = v66;
    std::vector<std::vector<double>> v63 = v62;
    std::vector<std::vector<double>> v89 = v44;
    v63[1] = v21;
    const std::vector<double> v76 = v149[2];
    v3[1] = v55;
    v28[2] = v76;
    const std::vector<double> v95 = v35[2];
    std::vector<double> v103 = v48;
    const std::vector<double> v97 = v62[0];
    v25[1] = v103;
    const double v143 = v95[0];
    const std::vector<std::vector<double>> v69 = f21(v112);
    const std::vector<std::vector<double>> v91 = f12(v63, v89, v69);
    v48[0] = v143;
    v48[0] = v73;
    const std::vector<std::vector<double>> v158 = f12(v15, v69, v91);
    v63[1] = v97;
    const std::vector<std::vector<double>> v201 = f12(v158, v7, v63);
    return v201;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    const std::vector<double> v9 = v1[1];
    const double v7 = v9[0];
    double v10 = v7;
    const std::vector<std::vector<double>> v12 = f21(v1);
    const std::vector<double> v85 = v0[0];
    const std::vector<std::vector<double>> v98 = f4(v12);
    const std::vector<double> v30 = v98[0];
    const double v44 = v85[0];
    const double v50 = v30[0];
    const double v47 = v44 + v50;
    const double v53 = v10 + v47;
    return v53;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    std::vector<std::vector<double>> v1({ { 2.0 }, { 3.0 }, { 4.0 } });
    double v2(5.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
