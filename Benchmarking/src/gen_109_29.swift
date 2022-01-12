  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v3: Double = v1
    let v8: Double = v1 * v3
    var v4: Double = v8
    var v2: Double = v4
    v4 = v3
    let v14: [Double] = [v4, v4, v2, v8, v4, v2, v1]
    var v24: [Double] = v14
    v24 = v14
    v24[4] = v2
    let v42: Double = v24[5]
    var v51: [Double] = v24
    let v76: Double = v51[1]
    v51[3] = v42
    return v76
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [1.0]), s0(p0: [[2.0]], p1: [3.0])], p1: [s0(p0: [[4.0]], p1: [5.0]), s0(p0: [[6.0]], p1: [7.0])])
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
