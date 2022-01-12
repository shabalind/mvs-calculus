  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s3 {
    var p0: [Double]
    var p1: [[s1]]
  }
  struct s5 {
    var p0: s3
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: s5, _ v2: Double) -> Double {
    let v6: s3 = v0.p0
    let v8: Double = v2 * v2
    let v3: [Double] = v6.p0
    let v9: Double = v3[0]
    var v12: Double = v9
    let v10: [[s1]] = v6.p1
    let v15: Double = v3[0]
    let v20: [Double] = v6.p0
    let v11: [s1] = v10[1]
    let v27: Double = v20[0]
    let v17: s1 = v11[0]
    let v19: s0 = v17.p1
    let v36: [[Double]] = v19.p1
    let v14: [[Double]] = v19.p1
    let v23: [Double] = v14[0]
    v12 = v8
    var v21: [[Double]] = v36
    v21[0] = v23
    var v28: [Double] = v23
    v21[0] = v28
    v28[0] = v27
    v28[0] = v12
    let v49: [Double] = v21[0]
    let v43: Double = v12 + v27
    var v57: [Double] = v49
    v28[0] = v43
    let v90: Double = v57[0]
    let v85: Double = v15 / v90
    return v85
  }
  func benchmark() {
    let v0: s5 = s5(p0: s3(p0: [0.0, 1.0], p1: [[s1(p0: [[s0(p0: [[2.0], [3.0], [4.0]], p1: [[5.0]])], [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0]])], [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0]])]], p1: s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0]]))], [s1(p0: [[s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0]])], [s0(p0: [[22.0], [23.0], [24.0]], p1: [[25.0]])], [s0(p0: [[26.0], [27.0], [28.0]], p1: [[29.0]])]], p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0]]))], [s1(p0: [[s0(p0: [[34.0], [35.0], [36.0]], p1: [[37.0]])], [s0(p0: [[38.0], [39.0], [40.0]], p1: [[41.0]])], [s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0]])]], p1: s0(p0: [[46.0], [47.0], [48.0]], p1: [[49.0]]))]]), p1: s1(p0: [[s0(p0: [[50.0], [51.0], [52.0]], p1: [[53.0]])], [s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0]])], [s0(p0: [[58.0], [59.0], [60.0]], p1: [[61.0]])]], p1: s0(p0: [[62.0], [63.0], [64.0]], p1: [[65.0]])))
    let v1: s5 = s5(p0: s3(p0: [66.0, 67.0], p1: [[s1(p0: [[s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]])], [s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]])], [s0(p0: [[76.0], [77.0], [78.0]], p1: [[79.0]])]], p1: s0(p0: [[80.0], [81.0], [82.0]], p1: [[83.0]]))], [s1(p0: [[s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]])], [s0(p0: [[88.0], [89.0], [90.0]], p1: [[91.0]])], [s0(p0: [[92.0], [93.0], [94.0]], p1: [[95.0]])]], p1: s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]]))], [s1(p0: [[s0(p0: [[100.0], [101.0], [102.0]], p1: [[103.0]])], [s0(p0: [[104.0], [105.0], [106.0]], p1: [[107.0]])], [s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]])]], p1: s0(p0: [[112.0], [113.0], [114.0]], p1: [[115.0]]))]]), p1: s1(p0: [[s0(p0: [[116.0], [117.0], [118.0]], p1: [[119.0]])], [s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]])], [s0(p0: [[124.0], [125.0], [126.0]], p1: [[127.0]])]], p1: s0(p0: [[128.0], [129.0], [130.0]], p1: [[131.0]])))
    let v2: Double = 132.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 132.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
