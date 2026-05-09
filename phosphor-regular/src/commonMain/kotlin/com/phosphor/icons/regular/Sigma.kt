package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Sigma: ImageVector
    get() {
        if (_Sigma != null) {
            return _Sigma!!
        }
        _Sigma = ImageVector.Builder(
            name = "Regular.Sigma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 72f)
                lineToRelative(0f, -24f)
                lineToRelative(-128f, 0f)
                lineToRelative(64f, 80f)
                lineToRelative(-64f, 80f)
                lineToRelative(128f, 0f)
                lineToRelative(0f, -24f)
            }
        }.build()

        return _Sigma!!
    }

@Suppress("ObjectPropertyName")
private var _Sigma: ImageVector? = null
