  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: [s0], _ v3: Double) -> Double {
    let v5: s0 = v2[1]
    let v7: [[Double]] = v5.p0
    let v6: [Double] = v7[0]
    let v18: s0 = v2[1]
    let v17: [[Double]] = v18.p0
    let v15: [Double] = v17[0]
    let v23: Double = v15[0]
    var v24: [Double] = v6
    v24[0] = v23
    let v68: Double = v24[0]
    return v68
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0]])
    let v1: s0 = s0(p0: [[3.0]], p1: [[4.0], [5.0]])
    let v2: [s0] = [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])]
    let v3: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
