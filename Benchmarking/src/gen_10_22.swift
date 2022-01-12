  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    let v4: [Double] = v1[0]
    var v12: [Double] = v4
    let v8: Double = v4[0]
    let v14: [Double] = v1[0]
    v12[0] = v3
    var v15: [Double] = v14
    let v9: [Double] = v0[0]
    var v23: [Double] = v9
    var v21: Double = v8
    let v51: [Double] = v1[0]
    let v43: Double = v15[0]
    let v62: Double = v12[0]
    v12 = v23
    let v47: Double = v12[0]
    let v65: [Double] = [v8, v47, v43, v3, v62]
    let v79: Double = v51[0]
    var v172: [Double] = v65
    v172[0] = v47
    var v180: [Double] = v172
    let v135: Double = v180[1]
    var v124: Double = v21
    v15[0] = v79
    var v81: Double = v135
    v180[0] = v124
    return v81
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0]]
    let v2: [[Double]] = [[2.0]]
    let v3: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
