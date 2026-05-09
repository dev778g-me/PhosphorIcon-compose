package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.HighHeelBold: ImageVector
    get() {
        if (_HighHeelBold != null) {
            return _HighHeelBold!!
        }
        _HighHeelBold = ImageVector.Builder(
            name = "Bold.HighHeelBold",
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
                moveTo(32f, 120f)
                curveToRelative(50.38f, 0f, 93.51f, 31.28f, 111.3f, 75.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.42f, 4.92f)
                horizontalLineTo(236f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineToRelative(-4.73f)
                arcTo(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 225.21f, 164f)
                lineTo(176f, 152f)
                lineTo(64f, 40f)
                curveTo(44.59f, 61.22f, 32f, 89f, 32f, 120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 130f)
                verticalLineToRelative(62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(120f)
            }
        }.build()

        return _HighHeelBold!!
    }

@Suppress("ObjectPropertyName")
private var _HighHeelBold: ImageVector? = null
