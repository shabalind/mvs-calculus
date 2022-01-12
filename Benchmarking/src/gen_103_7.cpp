  #include <vector>
  #include <iostream>
  #include <chrono>
  double f12(const double &v0) {
    double v3 = v0;
    double v5 = v0;
    double v7 = v5;
    double v2 = v3;
    v5 = v7;
    double v1 = v0;
    double v9 = v1;
    double v4 = v2;
    v7 = v9;
    double v8 = v9;
    double v11 = v5;
    const std::vector<double> v12 { v9, v8 };
    std::vector<double> v16 = v12;
    std::vector<double> v21 = v12;
    v16[1] = v0;
    v8 = v7;
    const double v43 = v21[0];
    std::vector<double> v35 = v16;
    v16[1] = v5;
    std::vector<double> v36 = v21;
    v16[0] = v43;
    v36[0] = v3;
    const double v37 = v36[0];
    v35[1] = v3;
    v36[1] = v3;
    v16[0] = v37;
    std::vector<double> v42 = v16;
    v21 = v42;
    std::vector<double> v31 = v35;
    std::vector<double> v52 = v31;
    v31[0] = v4;
    v52[1] = v11;
    const double v40 = v52[0];
    v16[1] = v5;
    v31[0] = v0;
    return v40;
  }
  __attribute__((noinline))
  double f0(const double &v0) {
    const std::vector<double> v6 { v0, v0, v0, v0, v0, v0, v0 };
    std::vector<double> v5 = v6;
    double v7 = v0;
    double v4 = v7;
    const double v2 = f12(v0);
    std::vector<double> v1 = v5;
    const double v3 = f12(v0);
    std::vector<double> v12 = v6;
    const double v10 = v1[6];
    double v11 = v4;
    const double v17 = f12(v7);
    double v13 = v2;
    const double v21 = v6[5];
    const double v35 = v12[1];
    v13 = v3;
    v5[6] = v3;
    double v34 = v17;
    const double v22 = f12(v17);
    const std::vector<std::vector<double>> v49 { v12 };
    const double v30 = v5[4];
    const double v47 = f12(v35);
    v12[6] = v21;
    const double v28 = f12(v30);
    const std::vector<double> v42 = v49[0];
    const double v60 = f12(v34);
    const double v54 = f12(v10);
    v1[4] = v47;
    const double v63 = f12(v4);
    const double v67 = f12(v11);
    const std::vector<double> v186 = v49[0];
    const double v101 = v186[3];
    const double v50 = v42[0];
    double v135 = v22;
    v12[0] = v28;
    v5[0] = v63;
    const double v93 = f12(v13);
    const double v197 = f12(v35);
    const double v230 = f12(v60);
    v1[1] = v50;
    const double v94 = f12(v197);
    const std::vector<double> v282 { v230, v94, v54, v135, v67, v35 };
    const double v178 = v282[3];
    v1[6] = v93;
    v5[0] = v101;
    return v178;
  }
  int main() {
    double v0(0.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
