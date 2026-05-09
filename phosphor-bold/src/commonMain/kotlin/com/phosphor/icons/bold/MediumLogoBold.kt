package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.MediumLogoBold: ImageVector
    get() {
        if (_MediumLogoBold != null) {
            return _MediumLogoBold!!
        }
        _MediumLogoBold = ImageVector.Builder(
            name = "Bold.MediumLogoBold",
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
                moveTo(68f, 128f)
                moveToRelative(-56f, 0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 128f)
                arcToRelative(24f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 0f)
                arcToRelative(24f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, -48f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(244f, 72f)
                lineTo(244f, 184f)
            }
        }.build()

        return _MediumLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _MediumLogoBold: ImageVector? = null
