package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.CloudSlashThin: ImageVector
    get() {
        if (_CloudSlashThin != null) {
            return _CloudSlashThin!!
        }
        _CloudSlashThin = ImageVector.Builder(
            name = "Thin.CloudSlashThin",
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
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(193.89f, 200.49f)
                arcTo(79.66f, 79.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 208f)
                horizontalLineTo(72f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85.92f, 97.74f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112.63f, 63.52f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 219.68f, 181.28f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 128f)
                arcTo(79.68f, 79.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 91.07f, 87.37f)
            }
        }.build()

        return _CloudSlashThin!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSlashThin: ImageVector? = null
