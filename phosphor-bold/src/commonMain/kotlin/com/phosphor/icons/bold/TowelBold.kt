package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.TowelBold: ImageVector
    get() {
        if (_TowelBold != null) {
            return _TowelBold!!
        }
        _TowelBold = ImageVector.Builder(
            name = "Bold.TowelBold",
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
                moveTo(56f, 184f)
                lineTo(176f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 148f)
                verticalLineTo(52.48f)
                curveToRelative(0f, -10.85f, -8.43f, -20.08f, -19.27f, -20.47f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 52f)
                verticalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 32f)
                horizontalLineTo(196f)
            }
        }.build()

        return _TowelBold!!
    }

@Suppress("ObjectPropertyName")
private var _TowelBold: ImageVector? = null
