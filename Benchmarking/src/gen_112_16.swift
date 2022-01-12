  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  func f4(_ v0: Double) -> Double {
    var v3: Double = v0
    var v2: Double = v3
    var v8: Double = v0
    var v9: Double = v8
    var v22: Double = v2
    var v10: Double = v22
    var v37: Double = v3
    let v25: Double = v10 + v37
    var v14: Double = v0
    var v26: Double = v9
    var v48: Double = v26
    let v89: [Double] = [v22, v0]
    var v40: [Double] = v89
    var v24: [Double] = v40
    v24[1] = v48
    v40[0] = v26
    v40[0] = v14
    var v42: [Double] = v89
    let v35: [[Double]] = [v40]
    var v34: [[Double]] = v35
    let v50: [Double] = v34[0]
    v34[0] = v42
    let v73: Double = v42[1]
    let v80: [Double] = v34[0]
    v34[0] = v24
    v42[1] = v25
    var v90: [[Double]] = v34
    var v53: [[Double]] = v34
    let v118: Double = v50[0]
    v90[0] = v80
    var v99: Double = v73
    v40[0] = v99
    v90 = v53
    let v95: [Double] = v90[0]
    v34[0] = v95
    return v118
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v8: Double = f4(v1)
    let v5: Double = f4(v8)
    let v10: Double = f4(v5)
    return v10
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0], [6.0]]), s0(p0: [[7.0], [8.0], [9.0]], p1: [[10.0], [11.0]], p2: [[12.0], [13.0]])], p1: s0(p0: [[14.0], [15.0], [16.0]], p1: [[17.0], [18.0]], p2: [[19.0], [20.0]]))
    let v1: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
