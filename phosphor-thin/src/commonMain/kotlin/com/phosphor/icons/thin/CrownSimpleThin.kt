package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.CrownSimpleThin: ImageVector
    get() {
        if (_CrownSimpleThin != null) {
            return _CrownSimpleThin!!
        }
        _CrownSimpleThin = ImageVector.Builder(
            name = "Thin.CrownSimpleThin",
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
                moveTo(54.71f, 200f)
                horizontalLineTo(201.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.88f, -6.61f)
                lineToRelative(22.7f, -104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 218f, 82.76f)
                lineTo(176f, 128f)
                lineTo(135.26f, 36.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.52f, 0f)
                lineTo(80f, 128f)
                lineTo(38f, 82.76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.9f, 6.66f)
                lineToRelative(22.7f, 104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.71f, 200f)
                close()
            }
        }.build()

        return _CrownSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _CrownSimpleThin: ImageVector? = null
