package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.UniteSquareThin: ImageVector
    get() {
        if (_UniteSquareThin != null) {
            return _UniteSquareThin!!
        }
        _UniteSquareThin = ImageVector.Builder(
            name = "Thin.UniteSquareThin",
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
                moveTo(96f, 216f)
                lineToRelative(120f, 0f)
                lineToRelative(0f, -120f)
                lineToRelative(-56f, 0f)
                lineToRelative(0f, -56f)
                lineToRelative(-120f, 0f)
                lineToRelative(0f, 120f)
                lineToRelative(56f, 0f)
                lineToRelative(0f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 40f)
                lineTo(216f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 40f)
                lineTo(216f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 104f)
                lineTo(152f, 216f)
            }
        }.build()

        return _UniteSquareThin!!
    }

@Suppress("ObjectPropertyName")
private var _UniteSquareThin: ImageVector? = null
