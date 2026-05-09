package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.TimerThin: ImageVector
    get() {
        if (_TimerThin != null) {
            return _TimerThin!!
        }
        _TimerThin = ImageVector.Builder(
            name = "Thin.TimerThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 136f)
                moveToRelative(-88f, 0f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 176f, 0f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, -176f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 136f)
                lineTo(168f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 16f)
                lineTo(152f, 16f)
            }
        }.build()

        return _TimerThin!!
    }

@Suppress("ObjectPropertyName")
private var _TimerThin: ImageVector? = null
