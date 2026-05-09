package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.GarageBold: ImageVector
    get() {
        if (_GarageBold != null) {
            return _GarageBold!!
        }
        _GarageBold = ImageVector.Builder(
            name = "Bold.GarageBold",
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
                moveTo(16f, 200f)
                lineTo(240f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 200f)
                verticalLineTo(98.67f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 220.44f, 92f)
                lineToRelative(-88f, -58.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.88f, 0f)
                lineTo(35.56f, 92f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 98.67f)
                verticalLineTo(200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 200f)
                lineToRelative(0f, -80f)
                lineToRelative(112f, 0f)
                lineToRelative(0f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                lineTo(128f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 160f)
                lineTo(184f, 160f)
            }
        }.build()

        return _GarageBold!!
    }

@Suppress("ObjectPropertyName")
private var _GarageBold: ImageVector? = null
