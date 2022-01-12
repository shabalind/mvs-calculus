  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s1, _ v2: Double) -> Double {
    let v5: [s0] = v1.p1
    let v4: s0 = v5[0]
    var v8: Double = v2
    let v10: [[Double]] = v4.p1
    var v23: Double = v8
    var v16: Double = v23
    let v28: [Double] = v10[0]
    let v18: Double = v28[0]
    var v25: Double = v2
    v25 = v23
    let v93: Double = v16 / v25
    let v144: Double = v93 + v18
    return v144
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])]
    let v1: s1 = s1(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: [s0(p0: [[6.0]], p1: [[7.0]]), s0(p0: [[8.0]], p1: [[9.0]])])
    let v2: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
