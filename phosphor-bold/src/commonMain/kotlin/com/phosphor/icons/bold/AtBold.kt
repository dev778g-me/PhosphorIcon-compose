package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.AtBold: ImageVector
    get() {
        if (_AtBold != null) {
            return _AtBold!!
        }
        _AtBold = ImageVector.Builder(
            name = "Bold.AtBold",
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
                moveTo(128f, 128f)
                moveToRelative(-40f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 208f)
                curveToRelative(-15.21f, 10.11f, -36.37f, 16f, -56f, 16f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, -96f)
                curveToRelative(0f, 22.09f, -8f, 40f, -28f, 40f)
                reflectiveCurveToRelative(-28f, -17.91f, -28f, -40f)
                verticalLineTo(88f)
            }
        }.build()

        return _AtBold!!
    }

@Suppress("ObjectPropertyName")
private var _AtBold: ImageVector? = null
