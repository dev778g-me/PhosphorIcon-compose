package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.CaretUpDownThin: ImageVector
    get() {
        if (_CaretUpDownThin != null) {
            return _CaretUpDownThin!!
        }
        _CaretUpDownThin = ImageVector.Builder(
            name = "Thin.CaretUpDownThin",
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
                moveTo(80f, 176f)
                lineToRelative(48f, 48f)
                lineToRelative(48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 80f)
                lineToRelative(48f, -48f)
                lineToRelative(48f, 48f)
            }
        }.build()

        return _CaretUpDownThin!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUpDownThin: ImageVector? = null
