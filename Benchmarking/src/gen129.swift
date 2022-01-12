  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v2: s0 = v0[0]
    let v14: s0 = v0[0]
    let v12: [[Double]] = v14.p0
    let v24: [Double] = v12[0]
    let v19: [Double] = v12[0]
    let v26: [[Double]] = v2.p0
    let v22: [Double] = v26[0]
    let v200: [Double] = v12[0]
    var v108: [Double] = v22
    let v257: [[Double]] = [v200, v108, v19]
    var v148: [[Double]] = v257
    var v58: [[Double]] = v148
    var v204: [[Double]] = v58
    let v265: [Double] = v204[2]
    let v216: Double = v265[0]
    v204[0] = v108
    v204[0] = v24
    return v216
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]])]
    let v1: Double = 1.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 1.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
