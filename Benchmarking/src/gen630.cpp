  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f39(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v9 = v0[0];
    std::vector<double> v16 = v9;
    std::vector<std::vector<double>> v33 = v0;
    v33[1] = v16;
    std::vector<std::vector<double>> v20 = v33;
    return v20;
  }
  std::vector<std::vector<double>> f35(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v3 = v0[0];
    std::vector<std::vector<double>> v7 = v0;
    std::vector<double> v4 = v3;
    std::vector<std::vector<double>> v9 = v7;
    const std::vector<double> v22 = v0[0];
    v9[0] = v22;
    v9[0] = v4;
    std::vector<std::vector<double>> v10 = v9;
    v7[0] = v22;
    std::vector<std::vector<double>> v23 = v10;
    std::vector<double> v20 = v3;
    v7[0] = v20;
    return v23;
  }
  std::vector<std::vector<double>> f34(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v7 = v0[0];
    const std::vector<std::vector<double>> v3 = f35(v0);
    const std::vector<double> v4 = v3[0];
    std::vector<std::vector<double>> v6 = v0;
    const std::vector<std::vector<double>> v11 = f35(v6);
    const double v1 = v4[0];
    v6[0] = v4;
    v6[0] = v7;
    std::vector<std::vector<double>> v10 = v11;
    const std::vector<double> v39 = v0[0];
    const std::vector<double> v14 { v1 };
    std::vector<double> v20 = v39;
    v6[0] = v20;
    v10[0] = v14;
    const std::vector<std::vector<double>> v41 = f35(v10);
    return v41;
  }
  std::vector<std::vector<double>> f33(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v5 = v0[1];
    const std::vector<std::vector<double>> v4 = f39(v0);
    const std::vector<std::vector<double>> v8 = f39(v4);
    const std::vector<double> v11 = v4[1];
    const std::vector<std::vector<double>> v23 = f39(v0);
    std::vector<std::vector<double>> v9 = v23;
    const std::vector<std::vector<double>> v34 = f39(v8);
    const std::vector<std::vector<double>> v22 = f39(v34);
    v9 = v22;
    v9[1] = v5;
    v9[1] = v11;
    return v9;
  }
  std::vector<std::vector<double>> f31(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v6 = f39(v0);
    const std::vector<std::vector<double>> v1 = f39(v6);
    std::vector<std::vector<double>> v3 = v0;
    const std::vector<std::vector<double>> v7 = f39(v3);
    const std::vector<std::vector<double>> v11 = f33(v1);
    const std::vector<double> v13 = v6[0];
    const std::vector<std::vector<double>> v2 = f39(v7);
    const std::vector<std::vector<double>> v9 = f39(v11);
    v3[1] = v13;
    const std::vector<double> v17 = v2[0];
    const std::vector<double> v12 = v9[0];
    const std::vector<std::vector<double>> v18 = f39(v11);
    std::vector<std::vector<double>> v72 = v18;
    v72[0] = v17;
    std::vector<std::vector<double>> v38 = v72;
    v38[0] = v13;
    const std::vector<std::vector<double>> v83 = f33(v38);
    v38[1] = v12;
    return v83;
  }
  std::vector<std::vector<double>> f30(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v2 = f34(v0);
    const std::vector<std::vector<double>> v6 = f34(v2);
    const std::vector<std::vector<double>> v5 = f34(v6);
    std::vector<std::vector<double>> v1 = v6;
    const std::vector<std::vector<double>> v3 = f34(v0);
    const std::vector<std::vector<double>> v7 = f34(v1);
    const std::vector<double> v8 = v5[0];
    v1[0] = v8;
    const std::vector<double> v18 = v0[0];
    const double v11 = v18[0];
    const std::vector<std::vector<double>> v16 = f35(v2);
    const std::vector<double> v12 = v1[0];
    const std::vector<std::vector<double>> v20 = f34(v16);
    const std::vector<std::vector<double>> v35 = f34(v16);
    double v22 = v11;
    std::vector<double> v25 = v12;
    std::vector<std::vector<double>> v41 = v7;
    const double v21 = v22 + v11;
    v25[0] = v21;
    const std::vector<std::vector<double>> v32 = f35(v41);
    const std::vector<std::vector<double>> v29 = f35(v20);
    std::vector<double> v138 = v18;
    const std::vector<std::vector<double>> v49 = f34(v6);
    std::vector<double> v44 = v8;
    std::vector<double> v57 = v138;
    const std::vector<std::vector<double>> v61 = f34(v29);
    const std::vector<std::vector<double>> v46 = f35(v35);
    const std::vector<std::vector<double>> v53 = f35(v3);
    v44 = v57;
    const std::vector<std::vector<std::vector<double>>> v104 { v49, v3, v53, v49, v46, v20, v32 };
    v41[0] = v25;
    std::vector<std::vector<double>> v128 = v53;
    std::vector<std::vector<double>> v115 = v41;
    const std::vector<std::vector<double>> v97 = v104[0];
    v115[0] = v44;
    const std::vector<std::vector<double>> v140 = v104[4];
    v1[0] = v57;
    const std::vector<std::vector<double>> v118 = f34(v140);
    const std::vector<std::vector<std::vector<double>>> v172 { v128, v61, v41, v118, v32, v115 };
    const std::vector<std::vector<double>> v226 = v172[2];
    v1 = v97;
    return v226;
  }
  std::vector<std::vector<double>> f15(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v6 = v0;
    return v6;
  }
  std::vector<std::vector<double>> f9(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3, const std::vector<std::vector<double>> &v4) {
    const std::vector<std::vector<double>> v9 = f15(v2);
    const std::vector<std::vector<double>> v11 = f15(v2);
    std::vector<std::vector<double>> v8 = v2;
    std::vector<std::vector<double>> v21 = v11;
    const std::vector<std::vector<double>> v6 = f15(v11);
    const std::vector<double> v18 = v9[0];
    const std::vector<std::vector<double>> v15 = f30(v2);
    const std::vector<std::vector<double>> v23 = f15(v15);
    v8[0] = v18;
    v8[0] = v18;
    const std::vector<double> v13 = v21[0];
    const std::vector<std::vector<std::vector<double>>> v34 { v11, v11, v2, v6, v23, v8 };
    const std::vector<std::vector<std::vector<std::vector<double>>>> v33 { v34, v34, v34, v34, v34, v34 };
    std::vector<std::vector<std::vector<std::vector<double>>>> v78 = v33;
    const std::vector<std::vector<double>> v27 = f34(v8);
    const std::vector<std::vector<std::vector<double>>> v58 = v78[0];
    const std::vector<std::vector<double>> v52 = v58[5];
    const std::vector<double> v46 = v27[0];
    v8[0] = v46;
    const std::vector<std::vector<double>> v168 = f35(v52);
    std::vector<std::vector<double>> v143 = v168;
    v143[0] = v13;
    const std::vector<std::vector<double>> v212 = f34(v143);
    return v212;
  }
  std::vector<std::vector<double>> f7(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v1 = v0;
    const std::vector<double> v4 = v0[0];
    std::vector<std::vector<double>> v3 = v1;
    const std::vector<std::vector<double>> v5 = f39(v3);
    const std::vector<double> v2 = v5[1];
    const std::vector<std::vector<double>> v10 = f31(v3);
    std::vector<std::vector<double>> v15 = v10;
    v1[0] = v4;
    v3[0] = v2;
    return v15;
  }
  std::vector<std::vector<double>> f2(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<std::vector<double>> v7 = f15(v1);
    const std::vector<std::vector<double>> v9 = f34(v7);
    const std::vector<std::vector<std::vector<double>>> v15 { v9 };
    std::vector<std::vector<std::vector<double>>> v16 = v15;
    v16[0] = v1;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v43 { v16, v16, v16, v16, v15, v16 };
    std::vector<std::vector<std::vector<std::vector<double>>>> v38 = v43;
    v38 = v43;
    const std::vector<std::vector<std::vector<double>>> v62 = v38[0];
    const std::vector<std::vector<double>> v113 = v62[0];
    std::vector<std::vector<double>> v94 = v113;
    return v94;
  }
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const std::vector<double> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3, const double &v4) {
    const std::vector<std::vector<double>> v5 = f33(v3);
    const std::vector<std::vector<double>> v10 = f2(v5, v2);
    const std::vector<std::vector<double>> v12 = f7(v3);
    const std::vector<std::vector<double>> v19 = f34(v10);
    const std::vector<std::vector<double>> v13 = f9(v2, v12, v19, v12, v12);
    const std::vector<double> v20 = v13[0];
    const double v52 = v20[0];
    return v52;
  }
  int main() {
    std::vector<double> v0({ 0.0, 1.0, 2.0 });
    std::vector<double> v1({ 3.0, 4.0, 5.0 });
    std::vector<std::vector<double>> v2({ { 6.0 } });
    std::vector<std::vector<double>> v3({ { 7.0 }, { 8.0 } });
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
