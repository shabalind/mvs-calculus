  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    let v10: [[Double]] = v1.p1
    let v21: [Double] = v10[1]
    let v42: Double = v21[0]
    var v18: [Double] = v21
    let v41: Double = v18[0]
    let v48: Double = v41 - v42
    var v103: [Double] = v21
    var v64: Double = v48
    let v100: Double = v103[0]
    v103[0] = v41
    let v133: Double = v100 - v64
    return v133
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0]])
    let v1: s0 = s0(p0: [[3.0]], p1: [[4.0], [5.0]])
    let v2: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
