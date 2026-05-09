package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.TextUnderlineThin: ImageVector
    get() {
        if (_TextUnderlineThin != null) {
            return _TextUnderlineThin!!
        }
        _TextUnderlineThin = ImageVector.Builder(
            name = "Thin.TextUnderlineThin",
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
                moveTo(64f, 224f)
                lineTo(192f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 56f)
                verticalLineToRelative(80f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -112f, 0f)
                verticalLineTo(56f)
            }
        }.build()

        return _TextUnderlineThin!!
    }

@Suppress("ObjectPropertyName")
private var _TextUnderlineThin: ImageVector? = null
