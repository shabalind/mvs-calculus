  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v4: s0 = v0.p1
    let v2: [s0] = [v4, v4, v4, v4, v4]
    let v6: s0 = v2[1]
    let v3: s0 = v2[0]
    let v7: s0 = v0.p1
    let v9: [[Double]] = v3.p1
    let v19: [[Double]] = v6.p1
    let v31: [Double] = v19[1]
    let v15: Double = v31[0]
    let v45: [Double] = v9[2]
    let v26: Double = v15 - v15
    let v40: [[Double]] = v7.p0
    let v51: [Double] = v40[0]
    var v36: [Double] = v31
    v36[0] = v26
    let v68: Double = v51[0]
    v36[0] = v68
    var v125: Double = v15
    var v72: Double = v125
    var v58: [Double] = v45
    let v80: Double = v72 - v15
    var v59: [Double] = v31
    let v91: [[Double]] = [v58, v45, v45, v36]
    v36 = v59
    let v210: [Double] = v91[2]
    var v123: [Double] = v210
    v58[0] = v80
    let v81: Double = v123[0]
    return v81
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]))
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
