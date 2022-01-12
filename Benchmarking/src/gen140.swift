  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    let v6: [[Double]] = v0.p1
    let v4: [Double] = v6[0]
    var v11: [[Double]] = v6
    let v7: [Double] = v11[1]
    let v3: Double = v7[0]
    v11[0] = v4
    v11[0] = v4
    let v16: Double = v7[0]
    let v29: Double = v3 / v16
    let v18: [Double] = [v29]
    let v78: Double = v18[0]
    return v78
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])
    let v1: s0 = s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])
    let v2: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
