  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f10(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v15 = v0[0];
    std::vector<double> v9 = v15;
    std::vector<std::vector<double>> v34 = v0;
    std::vector<std::vector<double>> v10 = v34;
    v10[0] = v9;
    return v10;
  }
  std::vector<std::vector<double>> f9(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v3 = v0;
    std::vector<std::vector<double>> v1 = v3;
    const std::vector<double> v2 = v0[0];
    std::vector<std::vector<double>> v7 = v1;
    v1[0] = v2;
    return v7;
  }
  double f8(const double &v0) {
    double v4 = v0;
    double v3 = v0;
    double v2 = v3;
    const std::vector<double> v6 { v4, v3, v4, v3 };
    const double v9 = v6[0];
    std::vector<double> v10 = v6;
    std::vector<double> v11 = v10;
    v10[0] = v2;
    std::vector<double> v12 = v10;
    double v14 = v9;
    std::vector<double> v30 = v12;
    std::vector<double> v41 = v30;
    v10[3] = v14;
    const double v35 = v11[3];
    const double v74 = v41[1];
    double v70 = v74;
    v10[3] = v4;
    const double v75 = v11[2];
    const double v89 = v35 + v70;
    double v77 = v75;
    v10[2] = v77;
    return v89;
  }
  std::vector<std::vector<double>> f7(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2) {
    const std::vector<std::vector<double>> v7 = f10(v1);
    const std::vector<std::vector<double>> v43 = f10(v7);
    const std::vector<std::vector<double>> v56 = f10(v43);
    return v56;
  }
  std::vector<std::vector<double>> f6(const std::vector<std::vector<double>> &v0, const std::vector<double> &v1, const std::vector<std::vector<double>> &v2) {
    const std::vector<double> v8 = v2[0];
    const std::vector<std::vector<double>> v6 = f9(v2);
    const std::vector<std::vector<double>> v4 = f9(v6);
    const std::vector<std::vector<double>> v7 = f9(v4);
    std::vector<double> v11 = v8;
    const double v3 = v1[0];
    double v13 = v3;
    double v29 = v13;
    const double v16 = f8(v13);
    const double v10 = f8(v16);
    const double v18 = v11[0];
    std::vector<std::vector<double>> v23 = v7;
    v11[0] = v29;
    std::vector<double> v22 = v1;
    const std::vector<std::vector<double>> v33 = f9(v23);
    std::vector<double> v34 = v22;
    v23[1] = v34;
    v34[0] = v18;
    const double v24 = f8(v10);
    v34[0] = v13;
    v11[0] = v24;
    return v33;
  }
  std::vector<std::vector<double>> f5(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3, const std::vector<std::vector<double>> &v4, const std::vector<std::vector<double>> &v5, const std::vector<std::vector<double>> &v6) {
    std::vector<std::vector<double>> v8 = v3;
    const std::vector<double> v7 = v3[1];
    std::vector<std::vector<double>> v15 = v2;
    const std::vector<double> v11 = v4[1];
    v8[0] = v7;
    const std::vector<std::vector<double>> v12 = f7(v2, v6, v8);
    std::vector<double> v19 = v11;
    v8[1] = v19;
    const std::vector<double> v16 = v2[0];
    std::vector<double> v30 = v7;
    const std::vector<std::vector<double>> v20 = f10(v2);
    std::vector<double> v14 = v16;
    v15[0] = v7;
    v15[0] = v7;
    const std::vector<double> v26 = v12[0];
    v15[0] = v26;
    std::vector<std::vector<double>> v39 = v1;
    const std::vector<double> v17 = v15[0];
    const double v42 = v14[0];
    const double v21 = f8(v42);
    const std::vector<double> v28 = v39[1];
    const std::vector<double> v23 = v20[0];
    v30[0] = v21;
    std::vector<std::vector<double>> v25 = v39;
    const std::vector<std::vector<double>> v33 = f7(v6, v2, v0);
    const double v31 = v16[0];
    v8[0] = v23;
    std::vector<std::vector<double>> v48 = v6;
    std::vector<std::vector<double>> v37 = v25;
    const std::vector<double> v29 = v5[0];
    std::vector<std::vector<double>> v82 = v2;
    const std::vector<double> v60 = v12[0];
    const double v43 = f8(v31);
    const std::vector<double> v46 = v37[2];
    v82[0] = v46;
    v15[0] = v23;
    std::vector<double> v34 = v14;
    const double v100 = v42 + v43;
    const std::vector<double> v50 = v82[0];
    const std::vector<double> v96 = v6[0];
    const std::vector<std::vector<double>> v138 { v60, v23, v29, v50 };
    v37[1] = v96;
    v82[0] = v28;
    const std::vector<double> v122 = v48[0];
    v14 = v7;
    std::vector<std::vector<double>> v102 = v138;
    v15[0] = v30;
    const std::vector<double> v105 = v33[0];
    v14 = v105;
    v25[0] = v122;
    const std::vector<double> v280 = v102[1];
    const double v194 = f8(v100);
    v19[0] = v194;
    v39[2] = v17;
    v102[3] = v34;
    v37[1] = v7;
    const std::vector<std::vector<double>> v198 { v96, v280 };
    return v198;
  }
  std::vector<std::vector<double>> f4(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<std::vector<std::vector<double>>> v6 { v1, v0 };
    const std::vector<std::vector<double>> v4 = v6[0];
    const std::vector<double> v3 = v4[0];
    std::vector<std::vector<double>> v5 = v4;
    std::vector<double> v8 = v3;
    std::vector<double> v11 = v8;
    v5 = v4;
    v5[0] = v11;
    const double v16 = v8[0];
    v11[0] = v16;
    const double v39 = f8(v16);
    v8[0] = v39;
    v5[0] = v8;
    return v5;
  }
  std::vector<std::vector<double>> f3(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2) {
    const std::vector<std::vector<double>> v3 = f10(v0);
    const std::vector<std::vector<double>> v6 = f10(v0);
    std::vector<std::vector<double>> v8 = v2;
    const std::vector<std::vector<double>> v7 = f5(v2, v1, v3, v8, v2, v2, v6);
    const std::vector<std::vector<double>> v16 = f5(v7, v1, v6, v2, v8, v2, v0);
    const std::vector<std::vector<double>> v11 = f4(v1, v1);
    const std::vector<std::vector<double>> v18 = f9(v16);
    std::vector<std::vector<double>> v44 = v11;
    const std::vector<std::vector<double>> v64 = f9(v18);
    const std::vector<double> v60 = v64[0];
    const std::vector<std::vector<double>> v71 = f4(v44, v1);
    const std::vector<std::vector<double>> v54 = f4(v1, v71);
    std::vector<double> v57 = v60;
    v44[1] = v57;
    const std::vector<std::vector<double>> v155 = f4(v11, v71);
    const std::vector<std::vector<double>> v229 = f4(v155, v11);
    const std::vector<std::vector<std::vector<double>>> v373 { v155, v71, v54, v44, v229 };
    std::vector<std::vector<std::vector<double>>> v106 = v373;
    v44[1] = v57;
    const std::vector<std::vector<double>> v172 = v106[3];
    return v172;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3, const double &v4) {
    const double v5 = f8(v4);
    const std::vector<double> v6 = v1[0];
    const double v8 = v6[0];
    const std::vector<double> v9 = v3[0];
    std::vector<std::vector<double>> v7 = v0;
    const std::vector<double> v16 { v5 };
    const std::vector<std::vector<double>> v11 = f7(v3, v3, v1);
    const std::vector<std::vector<double>> v30 = f10(v11);
    const std::vector<double> v12 = v1[1];
    std::vector<double> v10 = v6;
    const std::vector<std::vector<double>> v15 = f4(v7, v0);
    v7[0] = v10;
    const std::vector<std::vector<double>> v17 = f6(v15, v6, v1);
    std::vector<std::vector<double>> v21 = v11;
    v21[0] = v12;
    const std::vector<double> v18 = v17[1];
    const std::vector<std::vector<double>> v13 = f3(v11, v2, v17);
    const std::vector<double> v25 = v2[0];
    const std::vector<std::vector<double>> v35 = f9(v17);
    v10[0] = v8;
    v21[0] = v12;
    std::vector<std::vector<double>> v27 = v3;
    v21[0] = v16;
    const double v29 = v25[0];
    std::vector<std::vector<double>> v26 = v7;
    const std::vector<std::vector<double>> v50 = f9(v1);
    v26 = v2;
    std::vector<std::vector<double>> v52 = v30;
    double v70 = v8;
    std::vector<std::vector<double>> v41 = v21;
    const std::vector<double> v53 = v30[0];
    v52[0] = v9;
    v26 = v2;
    double v51 = v29;
    std::vector<std::vector<double>> v45 = v13;
    std::vector<std::vector<double>> v40 = v1;
    v41[0] = v16;
    v10[0] = v70;
    std::vector<std::vector<double>> v47 = v21;
    v7 = v26;
    const std::vector<std::vector<double>> v34 = f6(v45, v25, v40);
    std::vector<std::vector<double>> v49 = v27;
    std::vector<std::vector<double>> v85 = v34;
    const std::vector<double> v102 = v47[0];
    std::vector<std::vector<double>> v80 = v0;
    v41[0] = v9;
    std::vector<double> v39 = v18;
    const std::vector<std::vector<double>> v68 = f6(v7, v6, v17);
    const double v56 = v39[0];
    std::vector<std::vector<double>> v82 = v85;
    std::vector<double> v55 = v53;
    const std::vector<std::vector<double>> v100 = f9(v85);
    v55[0] = v51;
    v10[0] = v56;
    v45[2] = v55;
    const std::vector<std::vector<double>> v241 = f7(v52, v21, v82);
    v40[0] = v10;
    v82[0] = v102;
    std::vector<std::vector<double>> v95 = v50;
    const std::vector<std::vector<double>> v149 = f5(v95, v80, v241, v17, v35, v100, v41);
    const std::vector<double> v123 = v30[0];
    const std::vector<std::vector<double>> v159 = f7(v21, v49, v149);
    const std::vector<double> v93 = v159[0];
    v49[0] = v10;
    v80[1] = v18;
    const double v171 = v93[0];
    v49[0] = v123;
    const std::vector<double> v254 = v68[0];
    v82[1] = v25;
    v10[0] = v8;
    v27[0] = v254;
    return v171;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<std::vector<double>> v1({ { 3.0 }, { 4.0 } });
    std::vector<std::vector<double>> v2({ { 5.0 }, { 6.0 }, { 7.0 } });
    std::vector<std::vector<double>> v3({ { 8.0 } });
    double v4(9.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
