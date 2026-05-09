package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.VisorBold: ImageVector
    get() {
        if (_VisorBold != null) {
            return _VisorBold!!
        }
        _VisorBold = ImageVector.Builder(
            name = "Bold.VisorBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 104f)
                lineTo(176f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 64f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.05f, 128f)
                curveToRelative(-14.9f, 0.47f, -28.71f, -7.19f, -39.8f, -15.31f)
                arcToRelative(24.13f, 24.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -28.5f, 0f)
                curveTo(102.66f, 184.79f, 88.85f, 192.45f, 74f, 192f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 64f)
                close()
            }
        }.build()

        return _VisorBold!!
    }

@Suppress("ObjectPropertyName")
private var _VisorBold: ImageVector? = null
