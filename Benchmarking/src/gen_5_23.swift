  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[Double]]
  }
  struct s3 {
    var p0: s1
    var p1: s0
    var p2: s1
    var p3: [[s0]]
  }
  struct s5 {
    var p0: [s3]
    var p1: s3
  }
  func f11(_ v0: Double) -> Double {
    var v7: Double = v0
    var v5: Double = v7
    var v2: Double = v7
    var v8: Double = v0
    var v13: Double = v5
    var v12: Double = v7
    var v15: Double = v2
    var v16: Double = v2
    let v10: Double = v15 - v8
    var v26: Double = v5
    var v25: Double = v7
    let v19: [Double] = [v15, v2, v26, v2, v8, v13]
    let v40: Double = v19[5]
    var v30: [Double] = v19
    var v28: Double = v7
    v30[4] = v12
    v30[4] = v40
    var v99: Double = v10
    let v36: Double = v30[4]
    var v42: [Double] = v19
    v42[4] = v28
    let v31: Double = v42[2]
    v30[4] = v25
    v30[4] = v16
    v42[3] = v36
    let v119: [[Double]] = [v42, v30, v42, v30]
    let v39: [Double] = v119[1]
    v42[5] = v2
    let v86: Double = v39[2]
    v30[3] = v31
    v30[2] = v2
    v30[1] = v99
    return v86
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: [[s0]], _ v2: Double) -> Double {
    let v8: Double = f11(v2)
    let v9: [s0] = v1[1]
    let v4: s0 = v9[0]
    let v7: Double = v2 / v2
    let v30: Double = v4.p0
    let v29: Double = f11(v30)
    let v60: Double = v8 + v29
    let v92: Double = v7 + v60
    return v92
  }
  func benchmark() {
    let v0: s5 = s5(p0: [s3(p0: s1(p0: s0(p0: 0.0, p1: [[1.0], [2.0]]), p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: 6.0, p1: [[7.0], [8.0]]), p2: s1(p0: s0(p0: 9.0, p1: [[10.0], [11.0]]), p1: [[12.0], [13.0], [14.0]]), p3: [[s0(p0: 15.0, p1: [[16.0], [17.0]])], [s0(p0: 18.0, p1: [[19.0], [20.0]])], [s0(p0: 21.0, p1: [[22.0], [23.0]])]]), s3(p0: s1(p0: s0(p0: 24.0, p1: [[25.0], [26.0]]), p1: [[27.0], [28.0], [29.0]]), p1: s0(p0: 30.0, p1: [[31.0], [32.0]]), p2: s1(p0: s0(p0: 33.0, p1: [[34.0], [35.0]]), p1: [[36.0], [37.0], [38.0]]), p3: [[s0(p0: 39.0, p1: [[40.0], [41.0]])], [s0(p0: 42.0, p1: [[43.0], [44.0]])], [s0(p0: 45.0, p1: [[46.0], [47.0]])]])], p1: s3(p0: s1(p0: s0(p0: 48.0, p1: [[49.0], [50.0]]), p1: [[51.0], [52.0], [53.0]]), p1: s0(p0: 54.0, p1: [[55.0], [56.0]]), p2: s1(p0: s0(p0: 57.0, p1: [[58.0], [59.0]]), p1: [[60.0], [61.0], [62.0]]), p3: [[s0(p0: 63.0, p1: [[64.0], [65.0]])], [s0(p0: 66.0, p1: [[67.0], [68.0]])], [s0(p0: 69.0, p1: [[70.0], [71.0]])]]))
    let v1: [[s0]] = [[s0(p0: 72.0, p1: [[73.0], [74.0]])], [s0(p0: 75.0, p1: [[76.0], [77.0]])]]
    let v2: Double = 78.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 78.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
